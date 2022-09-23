#!/bin/bash

echo "Enter yet another number. IF you dare again!!!"
read num

if [[ num%2 -eq 0 ]]
then
echo "This is an even number."
else
echo "This is NOT en even number!"
fi
