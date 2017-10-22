L=[]
for a in range(2,101):
	for b in range(2,101):
		L.append(a**b)
L.sort()
result=[]
for i in range(0,len(L)):
	if L[i] not in result:
		result.append(L[i])
print len(result)