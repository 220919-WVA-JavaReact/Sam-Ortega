package com.revature.collections;

import java.util.HashSet;
import java.util.Iterator;
public class HashSets {
    /*
    Below is a list of exercises to help you get familiar with working with the HashSet Collection
     */
    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a hash set

        HashSet<String> hSet = new HashSet();
        hSet.add("red");
        hSet.add("green");
        hSet.add("blue");
        hSet.add("yellow");
        System.out.println(hSet);

        // 2. Write a Java program to iterate through all elements in a hash list.

        Iterator i = hSet.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


        // 3. Write a Java program to get the number of elements in a hash set

        System.out.println(hSet.size());

        // 4. Write a Java program to test a hash set is empty or not

        System.out.println(hSet.isEmpty());

        // 5. Write a Java program to convert a hash set to an array.

        int j = 0;
        String arr[] = new String[hSet.size()];
        for(String ele : hSet){
            arr[j++] = ele;
        }
        for(String n : arr){
            System.out.println(n);
        }


    }
}
