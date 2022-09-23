#!/bin/bash

echo "Give me a number, any number!"
read num

factorial=1

for ((i=2;i<=num;i++))
do
	factorial=$((factorial * i))
done

echo $factorial
