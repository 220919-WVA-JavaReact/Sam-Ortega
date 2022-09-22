#!/bin/bash

exec < $1
read header

while IFS="," read -r fname lname email uname pw
do
	echo "First Name: $fname";
	echo "Last Name: $lname";
	echo "Email: $email";
	echo "Username: $uname";
	echo "Password: $pw";
	echo "+--------------------------------+";
done
