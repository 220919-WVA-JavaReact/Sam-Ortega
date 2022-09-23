#!/bin/bash

echo "$PWD"
echo "$USER"
echo "Today is:" $(date +'%m/%d/%y')
echo "Number of users logged in :" who | wc -l
