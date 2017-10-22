a=1
b=1
while(a<999):
	while(b<999):
		c=1000-a-b
		if(a*a+b*b==c*c):
			print a*b*c
			s=[]
			s.append(a)
			s.append(b)
			s.append(c)
			print s
		b+=1
	b=1
	a+=1
a=1