def fact(num):
	i=1
	result=1
	while(i<=num):
		result*=i
		i+=1
	return result
power=20
print fact(power*2)/fact(power)/fact(power)

