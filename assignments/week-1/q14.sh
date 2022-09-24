#!/bin/bash


echo "Oh yes! It's another Palindrome question! You know what to do!!!"
read string
if [[ $(rev <<< "$string") == "$string" ]]
then
	echo "The Palindrome has been transferred!"
	echo $string >> palindrome.txt
else
	echo "You call that a Palindrome?!?!"
fi

