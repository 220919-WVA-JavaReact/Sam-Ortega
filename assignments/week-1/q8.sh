#!/bin/bash

echo "Enter your string if you dare!!!"
read string
if [[ $(rev <<< "$string") == "$string" ]]
then
	echo "That string is a palindrome!"
else
	echo "That was not even close to being a palindrome!!!!"
fi

