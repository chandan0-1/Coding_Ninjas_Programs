# import sys
# def minStepsTo1(n,dp):
# 	if n==0:
# 		return 0
# 	ans=sys.maxsize

# 	import math
# 	for i in range(1,int(math.sqrt(n))+1):

# 		index = n-i**2 

# 		if dp[index]==-1:
# 			small = minStepsTo1(n-(i**2),dp)
# 			myAns=1 + small
			
# 			dp[index] = small
# 		else:
# 			myAns=dp[index]+1

# 		ans = min(ans,myAns)
# 	print(dp)
# 	return ans

        

    
# n = int(input())
# dp=[-1]*n
# ans = minStepsTo1(n,dp)
# print(ans)

def fun(mat):

	n=len(mat)
	sum=0

	for i in range(n):
		x=mat[i][i]
		sum+=x

	j=n-1

	for i in mat:
		for x in range(1):
			v=i[j]
			sum+=v
			j-=1

	if n%2==0:
		return sum
	else:
		t=n//2
		b=mat[t][t]
		sum=sum-b
		# print(b)
		return sum
mat = [[5]]
print(fun(mat))