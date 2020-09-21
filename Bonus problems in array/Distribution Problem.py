n=int(input())
l=list(map(int,input().split()))
x=int(input())
l.sort()
diff=0
for i in range(len(l)-x+1):
    d=l[i+x-1]-l[i]
    if diff==0:
        diff=d
    elif d<diff:
        diff=d
print(diff)