def problem6():
	sum=0
	square=0
	i=0
	bound=100
	while(i<=bound):
		sum+=i*i
		i+=1
	i=0
	while(i<=bound):
		square+=i
		i+=1
	square*=square
	print square-sum
problem6()