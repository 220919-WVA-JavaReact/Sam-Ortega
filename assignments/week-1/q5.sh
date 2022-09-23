#!/bin/bash

positive=0
negative=0

function posOrNeg () {
if [ $1 -gt 0 ]
then
positive=$((positive+1))
else
negative=$((negative+1))
fi
}

echo "Enter 10 Numbers!"
echo "Number1: "
read num1
echo "Number2: "
read num2
echo "Number3: "
read num3
echo "Number4: "
read num4
echo "Number5: "
read num5
echo "Number6: "
read num6
echo "Number7: "
read num7
echo "Number8: "
read num8
echo "Number9: "
read num9
echo "Number10: "
read num10
posOrNeg $num1
posOrNeg $num2
posOrNeg $num3
posOrNeg $num4
posOrNeg $num5
posOrNeg $num6
posOrNeg $num7
posOrNeg $num8
posOrNeg $num9
posOrNeg $num10
echo "$positive Positive numbers"
echo "$negative Negative numbers"
