#!/bin/bash

if [ ${1} -ge 90 ] && [ ${1} -le 100 ]
then
echo "Grade A"
elif [ ${1} -lt 90 ] && [ ${1} -ge 80 ]
then
echo "Grade B"
elif [ ${1} -lt 80 ] && [ ${1} -ge 70 ]
then
echo "Grade C"
elif [ ${1} -lt 70 ] && [ ${1} -ge 60 ]
then
echo "Grade D"
elif [ ${1} -lt 60 ]
then
echo "Grade F"
fi
