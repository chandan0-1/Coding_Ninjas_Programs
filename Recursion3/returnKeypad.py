def getString(n):
	if n==1:
		return "abc"
	if n==2:
		return "def"
	if n==3:
		return "ghi"
	if n==4:
		return "jkl"
	if n==5:
		return "mno"
	if n==6:
		return "pqrs"
	if n==7:
		return "tuv"
	if n==8:
		return "xyz"
	return ""

def returnKeypad(n):
	if n==0:
		output=[]
		output.append("")
		return output
	digit=n%10
	n=n//10
	smalloutput=returnKeypad(n)

	string=getString(digit)
	output=[]

	for i in smalloutput:
		for char in string:
			option=i+char
			output.append(option)

	return output

print(returnKeypad(int(input())))