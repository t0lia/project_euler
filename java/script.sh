#!/bin/bash
COUNT=9
# while цикл
while [ $COUNT -gt 0 ]; do
#mkdir Problem00$COUNT
cd Problem00$COUNT
#mkdir bin
rmdir scr
#mkdir test
#mkdir lib
#mkdir ext
#mkdir docs
cd ..
echo Value of count is: $COUNT
let COUNT=COUNT-1
done
COUNT=99
# while цикл
while [ $COUNT -gt 9 ]; do
#mkdir Problem0$COUNT
cd Problem0$COUNT
#mkdir bin
rmdir scr
#mkdir test
#mkdir lib
#mkdir ext
#mkdir docs
cd ..
echo Value of count is: $COUNT
let COUNT=COUNT-1
done
COUNT=500
# while цикл
while [ $COUNT -gt 99 ]; do
#mkdir Problem$COUNT
cd Problem$COUNT
#mkdir bin
rmdir scr
#mkdir test
#mkdir lib
#mkdir ext
#mkdir docs
cd ..
echo Value of count is: $COUNT
let COUNT=COUNT-1
done