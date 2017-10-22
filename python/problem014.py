def CollatzNext(n):
	if(n%2):
		return n*3+1
	else:
		return n/2

import time
L=[]
t=time.time()
current=2
num=2
bound=1000*1000
maxlenght=0
count=0
L.append(1)
L.append(1)
while(num<=bound):
	current=num
	count=1
	while(current!=1):
		current= CollatzNext(current)
		if(current>=len(L)):
			count+=1
		else:
			count+=L[current]
			break

	if(count==525):
		print num
	L.append(count)
	num+=1
print(max(L))
print time.time()-t