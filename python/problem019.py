import datetime
dt = datetime.datetime(1901,01,01,10,10,10)
delta=datetime.timedelta(hours=24)
dt2=datetime.datetime(2000,12,31,10,10,10)
count=0
while (dt<dt2):
	dt+=delta
	if(dt.strftime("%a")=="Sun" and dt.strftime("%d")=="01"):
		print dt,dt.strftime("%a")
		count+=1

print count