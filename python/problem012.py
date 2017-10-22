
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

def GetCount(L,number):
	num=number
	#print L
	sum=1
	temp=0
	i=0
	while(i<1000 and L[i]<=number):
		temp=0
		#if(number%2!=0 or number%3!=0 ):
		#	return 0
		while(number%L[i]==0):
			temp+=1
			number=number/L[i]
		if(temp):
			sum*=temp+1
		i+=1
	if(sum>500 and sum <1000):
		print num,":",sum

#function return next triangilar
def NextTriangilar(sum,number):
	return sum+number
import time

t=time.time()

L=[]
getPrime(L,100000)
#print "time",time.time()-t
number=0
sum=0
while(number<13000):
	sum=NextTriangilar(sum,number)
	#GetCount(L,number)
	#if(number==6+1):
	GetCount(L,sum);
	number+=1
#print GetCount(L,28)
#print GetCount(28)
#print "time",time.time()-t