def fun(s):
    if len(s)==0:
        output=[""]
        return output
    
    small=fun(s[1:])
    output=[]
    for x in small :
        output.append(x)
    for x in small:
        output.append(s[0]+x)
    return output
        
s=input()
print(fun(s))