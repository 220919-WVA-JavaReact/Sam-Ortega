#!/bin/bash

echo -e  "Enter a number PLEASE!!!"
read num

for((i=2; i<=$num/2; i++))
do
	if [[ $((num%i)) -eq 0 ]]
	then
		echo "This is not a prime number."
		exit 0
	fi
done
echo "This is a prime number."
