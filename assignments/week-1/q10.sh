#!/bin/bash

highest=0

echo "You will enter three numbers one at a time."
echo "Enter the first number."

read num1
if [ $num1 -gt $highest ]
then

highest=$num1
fi
echo $highest
echo "Enter the second number."
read num2
if [ $num2 -gt $highest ]
then

highest=$num2
fi
echo $highest
echo "Enter the third number."
read num3
if [ $num3 -gt $highest ]
then

highest=$num3
fi

echo "the MAX is: " $highest
