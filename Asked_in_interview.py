
# Write your code here
for _ in range(int(input())):
    a,b,n=map(int,input().split())
    for i in range(n-1):
    	# if len(str(a))==9 or  len(str(b))==9:
    	# 	break
    	temp=a
    	a=b-a
    	b=b+temp
        
    # t=(10**9)+7
    print(a%1000000007,b%1000000007)


#______________________________OR______________________________
import itertools
x=4
y=2
temp = [list(l) for l in itertools.combinations(range(1,max(x,y)),2) if sum(l)==x and l[0]^l[1]==y ]
print(*temp)