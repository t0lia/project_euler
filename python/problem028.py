print "hello28"
shift=2
first=1
max=1001/2+1
sum=0
#print("1")
sum+=1
for i in range (1,max):
	sum+= first+shift+ first+2*shift+first+3*shift+ first+4*shift
	#print first+shift, first+2*shift,first+3*shift, first+4*shift
	first=first+4*shift
	shift+=2
print sum