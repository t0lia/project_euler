def GetLetterCount(number):
	sum=0
	str=""
	if(number==1000):
		return"onethousand"

	if(number/100%10==1):
		str+="onehundred"
	if(number/100%10==2):
		str+="twohundred"
	if(number/100%10==3):
		str+="threehundred"
	if(number/100%10==4):
		str+="fourhundred"
	if(number/100%10==5):
		str+="fivehundred"
	if(number/100%10==6):
		str+="sixhundred"
	if(number/100%10==7):
		str+="sevenhundred"
	if(number/100%10==8):
		str+="eighthundred"
	if(number/100%10==9):
		str+="ninehundred"

	if(number/100%10!=0 and number%100!=0):
		str+="and"
	if(number%100>=10 and number%100<20):
		if(number%100==10):
			str+="ten"
		if(number%100==11):
			str+="eleven"
		if(number%100==12):
			str+="twelve"
		if(number%100==13):
			str+="thirteen"
		if(number%100==14):
			str+="fourteen"
		if(number%100==15):
			str+="fifteen"
		if(number%100==16):
			str+="sixteen"
		if(number%100==17):
			str+="seventeen"
		if(number%100==18):
			str+="eighteen"
		if(number%100==19):
			str+="nineteen"
	else:
		if((number/10)%10==2):
			str+="twenty"
		if((number/10)%10==3):
			str+="thirty"
		if((number/10)%10==4):
			str+="forty"
		if((number/10)%10==5):
			str+="forty"
		if((number/10)%10==6):
			str+="sixty"
		if((number/10)%10==7):
			str+="seventy"
		if((number/10)%10==8):
			str+="eighty"
		if((number/10)%10==9):
			str+="ninety"

		if(number%10==1):
			str+="one"
		if(number%10==2):
			str+="two"
		if(number%10==3):
			str+="three"
		if(number%10==4):
			str+="four"
		if(number%10==5):
			str+="five"
		if(number%10==6):
			str+="six"
		if(number%10==7):
			str+="seven"
		if(number%10==8):
			str+="eight"
		if(number%10==9):
			str+="nine"
	return str
	
number=991
sum=0
#print number," count:",GetLetterCount(number)
for i in range(1,1001):
	sum+=len(GetLetterCount(i))
	#print i,GetLetterCount(i),len(GetLetterCount(i))
print sum