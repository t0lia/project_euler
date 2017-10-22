
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
def getCircular(number):
	num=number
	L=[]
	max=0
	while(num>0):
		num/=10
		max+=1
	#print max
	num=number
	num=num/10+(num%(10))*(10**(max-1))
	while(num!=number):
		L.append(num)
		num=num/10+(num%(10))*(10**(max-1))
	L.append(number)
	
	return L
#	print max
#	while(num!=number):
#		num=

L=[]
getPrime(L,1000000)
#print L
count = 0 
for j in range(0,len(L)):
	candidates=getCircular(L[j])
	flag=True
	for i in range(0,len(candidates)):
		if candidates[i] not in L:
			flag=False
			break
	if(flag):
		print candidates
		count+=1
print count


#print candidates
'''


'''