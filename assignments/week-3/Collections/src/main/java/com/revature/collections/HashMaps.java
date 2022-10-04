package com.revature.collections;

import java.util.HashMap;
public class HashMaps {
    /*
    Below is a list of exercises to help you get familiar with working with the HashMap Collection
     */
    public static void main(String[] args) {

        // 1. Create a HashMap with Integers for the Keys and Strings for the Entries. Insert 5 entries with numbers as
        // the key and colors as the value associated

        HashMap map = new HashMap();
        map.put(1, "green");
        map.put(2, "orange");
        map.put(3, "yellow");
        map.put(4, "blue");
        map.put(5, "red");
        System.out.println(map);
        // 2. Write a Java program to count the number of key-value (size) mappings in a map.

        System.out.println(map.size());
        // 3. Write a Java program to test if a map contains a mapping for the specified key

        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(6));
        // 4. Write a Java program to get the value of a specified key in a map.

        System.out.println(map.get(3));
        // 5. Write a Java program to get a set view of the keys contained in this map.

        System.out.println(map.keySet());
    }
}
