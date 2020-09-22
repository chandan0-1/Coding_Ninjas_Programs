## Write your code here
n=int(input())
arr=[int(x) for x in input().split()]
leftmax=[arr[0]]
rightmax=[0]*n

for x in range(1,len(arr)):
	if leftmax[-1]>arr[x]:
		leftmax.append(leftmax[-1])
	else:
		leftmax.append(arr[x])
# i=n-3
# while i>=0:
Max=arr[-1]
for i in range(n-1,-1,-1):
	if arr[i]>Max:
		rightmax[i]=arr[i]
		Max=arr[i]
	else:
		rightmax[i]=(Max)
		# Max=arr[i]
	# i-=1
s=0
for i in range(n):
	s+=min(leftmax[i],rightmax[i])-arr[i]
print(s)