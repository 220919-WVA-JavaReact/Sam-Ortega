package com.revature.collections;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {

    /*
    Below is a list of exercises to help you get familiar with working with the ArrayList Collection
     */
    public static void main(String[] args) {

        // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

        ArrayList<String> colors = new ArrayList<String>();
            colors.add("red");
            colors.add("blue");
            colors.add("green");

        System.out.println(colors);

        // 2. Write a Java program to iterate through all elements in an array list

            for (int i = 0; i < colors.size(); i++) {
                System.out.println(colors.get(i));
            }

        // 3. Write a Java program to insert an element into the array list at the first position
            colors.add(0, "yellow");
            System.out.println(colors);

        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list
            System.out.println(colors.get(2));

        // 5. Write a Java program to remove the third element from an array list.
            colors.remove(1);
            System.out.println(colors);
            colors.remove("green");
            System.out.println(colors);
        // 6. Write a Java program to search an element in an array list.
            System.out.println(colors.indexOf("blue"));

        // 7. Write a Java program to sort a given array list.
            //first i'm going to add more colors to see if it's actually being sorted.
            colors.add("red");
            colors.add("purple");
            colors.add("black");
            colors.sort(Comparator.naturalOrder());
            System.out.println(colors);

    }


}