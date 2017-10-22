def problem2():
	bound=4000000
	a=1
	b=2
	c=0
	sum=0
	while(a<bound):
		if(a%2==0):
			sum+=a
		c=a+b
		a=b
		b=c
	print(sum)
problem2()