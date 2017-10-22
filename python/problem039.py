def Perimetr(number):
	count=0
	i=number/3
	j=1
	while(i<number+1):
		j=(number-(number/3))/2
		while(i+j<number):
			k=number-i-j
			if(i**2==j**2+k**2):
				#print i,j,k
				count+=1
			j+=1
		i+=1
	return count
# a^2+b^2=c^2
# a+b+c<1000
max=0
newMax=0
maxI=0
for i in range(10,1001):
	newMax=Perimetr(i)
	if(newMax>max):
		max=newMax
		maxI=i
print maxI
