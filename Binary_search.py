def Binary_Search(arr,n,target):
    start=0
    end=n-1
    while start <= end:
        mid = ((start+end)) //2

        
        if arr[mid] == target:
            return mid
        if arr[mid] > target:
            end = mid-1
        if arr[mid] < target:
            start = mid + 1
        # else:
            # return mid
    return -1

n=int(input())
if n>0:
	arr = [int(x) for x in input().split()]
else:
    arr = []
for _ in range(int(input())):
    target=int(input())
    print(Binary_Search(arr,n,target))