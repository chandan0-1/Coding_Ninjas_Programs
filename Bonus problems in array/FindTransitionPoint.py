def fun(arr,n):
    i=0
    end=n-1
    while i<=end:
        mid= (i+end)//2
        if arr[mid]==0:
            i=mid+1
        elif arr[mid]==1 and (arr[mid-1]==0 or mid==0):
            return mid
        else:
            end=mid-1
    return -1

n=int(input())
if n>0:
    l=[int(x) for x in input().split()]
    print(fun(l,n))
else:
    print(fun([],n))