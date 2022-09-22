#!/bin/bash

echo Add the following info;
	read -p 'first_name: '  fname
	read -p 'last_name: ' lname
	read -p 'email: ' email
	read -p 'username: ' uname
	read -p 'password: ' pw
echo $fname,$lname,$email,$uname,$pw >> MOCK_DATA.csv
