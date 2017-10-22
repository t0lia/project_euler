def isPalindrome(s):
	k=len(s)/2
	shift=0
	if(len(s)%2!=0):
		shift=1
	s1 = s[0:k]
	s2= s[k+shift:len(s)]
	return s1==s2[::-1]
sum=0
for i in range(1,1000000):
	number=i
	s_dec =str(number)
	s_bin="{0:b}".format(number)
	if(isPalindrome(s_dec) and isPalindrome(s_bin)):
		print number
		sum+=i
		#print isPalindrome(s_dec)
		#print isPalindrome(s_bin)
#print s_bin,s_dec
print "Sum:",sum