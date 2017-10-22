import time

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

L=[]
t=time.time()
getPrime(L,2000000)
#print L[-1]
i=0
sum=0
while(i<len(L)):
	sum+=L[i]
	i+=1
print sum
print time.time()-t