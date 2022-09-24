#!/bin/bash

num=0
rows=5
for((i=0; i<=rows; i++))
do
echo " "
	for((j=0; j<=i; j++))
	do
		echo -n "  *"
		
	done
	num=0
	echo "  "
done
