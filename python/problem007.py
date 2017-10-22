def getPrime(L,max):
	prime=[2,3,5]
	L+=[2,3,5]
	count=3
	candidate=7
	isCandidateConfirmed=True
	while(candidate<max):
		isCandidateConfirmed=True
		i=0
		while(prime[i]**2<=candidate):
			if(candidate%prime[i]==0):
				isCandidateConfirmed=False
				break
			i+=1
		if(isCandidateConfirmed==True):
			prime.append(candidate)
			L.append(candidate)
			count+=1
		candidate+=2

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

L=[]
getPrime(L,10002)
print L[10001-1]