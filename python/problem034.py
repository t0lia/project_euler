def fact(num):
	i=1
	result=1
	while(i<=num):
		result*=i
		i+=1
	return result

def check(num):
	s=str(num)
	sum=0
	for i in range(len(s)):
		sum+=fact(int(s[i]))
	if(sum==num):
		return True
	return False
sum=0
i=3
while(True):
	if(check(i)):
		sum+=i
		print sum
	i+=1