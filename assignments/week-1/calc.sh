#!/bin/bash

#set firstNum secondNum;

#set operation;

echo "Select operation: + - * /" operation;
read operation;
echo "firstNum=";
read firstNum;
echo "secondNum=";
read secondNum;

if ! [[ ${firstNum}=~^[0-9]+$ ]] || ! [[ ${secondNum}=~^[0-9]+$ ]];
then
	echo "One of the values is not a number!!!";
exit
fi

#echo "The result is: " $((${1}${operation}${2}));

echo "The result is: "$((${firstNum}${operation}${secondNum}));


