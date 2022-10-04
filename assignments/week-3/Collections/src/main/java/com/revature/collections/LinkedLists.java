package com.revature.collections;

import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Iterator;

public class LinkedLists {
    /*
  Below is a list of exercises to help you get familiar with working with the ArrayList Collection
   */
    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a linked list. Add several values.

        LinkedList myList = new LinkedList();

        myList.add("house");
        myList.add("keys");
        myList.add("phone");
        System.out.println(myList);
        myList.addLast("cup");
        System.out.println(myList);

        // 2. Write a Java program to iterate through all elements in a linked list.

        Iterator iterate = myList.iterator();
//        System.out.println(iterate.next());
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

        // 3. Write a Java program to iterate a linked list in reverse order

        Iterator iterate2 = myList.descendingIterator();
//        System.out.println(iterate2.next());
        while(iterate2.hasNext()){
            System.out.println(iterate2.next());
        }

        // 4.  Write a Java program to insert the specified element at the front of a linked list

        myList.addFirst("car");
        System.out.println(myList);
        // 5. Write a Java program to insert some elements at the specified position into a linked list.

        LinkedList newList = new LinkedList();
        newList.add("new_item");
        newList.add("other_item");

        myList.addAll(2, newList);
        System.out.println(myList);
        // 6. Write a Java program to get the first and last occurrence of the specified elements in a linked list.

        Object first = myList.getFirst();
        Object last = myList.getLast();
        System.out.println(first + " is the first and " + last + " is the last.");
        // 7. Write a Java program to check if a particular element exists in a linked list.

        if(myList.contains("house")){
            System.out.println("yep! it's in there.");
        }else{
            System.out.println("it is not in this list.");
        }
        // 8. Write a Java program to convert a linked list to array list.

        ArrayList arr = new ArrayList(myList);
        System.out.println("this is an arrayList now?..." + arr);

    }
}
