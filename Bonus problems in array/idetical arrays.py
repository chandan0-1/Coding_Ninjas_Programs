n=int(input())
a=[int(x) for x in input().split()]
b=[int(x) for x in input().split()]
c=0
# exp=[]
# for i in range(len(a)):
# 	for j in range(len(a)):
# 		if b[i]==a[j]:
# 			exp.append(j)
# bi=[int (i) for i in range(len(a))]
# print(ai,bi)
# i=0
# while i<len(a):
# 	if exp[i]!=bi[i]:
# 		exp[i],i=i,exp[i]
# 		c+=1
# 		i+=1
# print(c)
for i in range(len(a)):
	if a[i]==b[i]:
		continue
	else:
		for j in range(i+1,len(b)):
			if a[i]==b[j]:
				b[i],b[j]=b[j],b[i]
				c+=1
print(c)