#!/bin/bash

for num in "$@"
do

if [[ $num%2 -eq 0 ]]
then
echo ${num} >> even.txt

else
echo ${num} >> odd.txt

fi
done
echo "The odds and evens have been transferred!"
