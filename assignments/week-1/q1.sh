#!/bin/bash


num=0
rows=5
for((i=0; i<=rows; i++))
do
	for((j=0; j<=i; j++))
	do
		echo -n "$num "
		num=$((num + 1))
	done
	num=0
	echo
done
