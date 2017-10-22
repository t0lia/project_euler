def digitSum(number):
	count=1
	i=0
	sum=0
	while (i<len(str(number))):
		charvar=(str(number))[i]
		i+=1
		sum+=int(charvar)
	return sum

a=1
for i in range(1,100+1):
	a*=i
#print a
#print
print digitSum(a)