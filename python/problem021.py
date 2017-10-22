def GetDivisors(number):
	result=[1]
	for i in range(2,number/2+1):
		if(number%i==0):
			result.append(i)
	return result
def IsAmiable(number):
	L=GetDivisors(number)
	num1=0
	for i in range(0,len(L)):
		num1+=L[i]
	L2=GetDivisors(num1)
	num2=0
	for i in range(0,len(L2)):
		num2+=L2[i]
	if(num2==number and num1!=num2):
		return True
	return False

import time
t=time.time()
sum=0
for i in range(1,10000):
	if(IsAmiable(i)):
		sum+=i
print sum
