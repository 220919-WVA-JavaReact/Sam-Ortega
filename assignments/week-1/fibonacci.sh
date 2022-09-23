#!/bin/bash

upTo=100

firstNum=0

secondNum=1

for (( i=0; i<upTo; i++ ))
do
	echo -n "$firstNum "
	fib=$((firstNum + secondNum))
	firstNum=$secondNum
	secondNum=$fib
done
