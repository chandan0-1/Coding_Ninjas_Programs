def lis(li,n):
	dp=[[0,0] for i in range(n+1)]
	# print(dp)

	for i in range(n-1,-1,-1):
		including_max=1
		for j in range(i+1,n):
			if li[j]>li[i]:
				including_max=max(including_max,1+dp[j][0])

		dp[i][0]=including_max
		excluding_max=dp[i+1][1]

		overall_max=max(including_max,excluding_max)

		dp[i][1]=overall_max

	return dp[0][1]
n=int(input())
l=[int(x) for x in input().split()]
print(lis(l,n))