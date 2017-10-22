a=0
b=1
i=1
while(True):
	c=a+b
	a=b
	b=c

	s=str(a)
	count=len(s)
	if(count==1000):	
		print i
		break
	i+=1
