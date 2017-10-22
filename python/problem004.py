def isPalindrome(candidate):
	if(candidate/100000==candidate%10 and (candidate/10000)%10==(candidate/10)%10 and (candidate/1000)%10==(candidate/100)%10):
		return True
	return False


a=1
b=1
mul=0
max=0
while(a<1000):
	b=1
	while(b<1000):
		mul=a*b
		b+=1
		if(isPalindrome(mul) and mul>max):
			max=mul
		
	a+=1
print max