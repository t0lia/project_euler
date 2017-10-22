def LexiographicalPermutationNext(s):
	firstmin=s[len(s)-1]
	i=len(s)-1
	while(i>-1):
		if(firstmin <= s[i]):
			firstmin=s[i]
		else:
			break
		i-=1
	
	firstmin=s[i]
	#print firstmin,i
	firstmax=-1
	k=0
	for j in range(i+1,len(s)):
		if(firstmin<s[j]):
			if(firstmax==-1):
				firstmax=s[j]
				k=j
			else:
				if(firstmax>s[j]):
					firstmax=s[j]
					k=j
	#print firstmax,k
	newS=""
	for j in range(0,len(s)):
		if(j==i):
			newS+=(s[k])
		elif(j==k):
			newS+=(s[i])
		else:
			newS+=(s[j])
	
	s=newS[i+1:]
	s=s[::-1]
	s=newS[:i+1]+s
	return s

import time
t=time.time()

number=123456789
s=str(number)

if(len(s)==9):
		s="0"+s
i=0
while(i<1000000):
	i+=1
	print i,":",s
	s= LexiographicalPermutationNext(s)
print time.time()-t