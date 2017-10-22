def checkNumber(num):
	s=str(num)
	sum=0
	for i in range(len(s)):
		#print ":",int(s[i])
		sum+=int(s[i])**5
	#print sum
	if(sum==num):
		print "-",sum
		return True
	return False

sum=0
for i in range(2,999999):
	if(checkNumber(i)):
		print i
		sum+=i
print sum

#print checkNumber(4151)