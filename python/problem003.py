def getPrime(L,size):
	prime=[2,3,5]
	L+=[2,3,5]
	count=3
	candidate=6
	isCandidateConfirmed=True
	while(count<size):
		isCandidateConfirmed=True
		i=0
		while(i<count):
			if(candidate%prime[i]==0):
				isCandidateConfirmed=False
				break
			i+=1
		if(isCandidateConfirmed==True):
			prime.append(candidate)
			L.append(candidate)
			count+=1
		candidate+=1

number=600851475143
i=0
prime=[]
getPrime(prime,1000)
while(True):
	if(number==prime[i]):
		break
	if(number%prime[i]==0):
		number/=prime[i]
	else:
		i+=1
print number