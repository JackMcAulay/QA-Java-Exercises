package com.qa.ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayLists {
    public void start(){
        List<Integer> intArray = new ArrayList<Integer>();     //create a new ArrayList

        for (int i = 1; i <= 10; i++){      //add() several elements
            intArray.add(i);
        }

        System.out.println(intArray + "\n");        //print out the entire ArrayList

        for (int i = 0; i < intArray.size(); i++){      //iterate through the ArrayList and print out each element
            System.out.println(intArray.get(i));
        }

        System.out.println("\n" + intArray.get(5));      //get() specific elements

        intArray.set(0, 100);       //set() different elements
        intArray.set(1, 150);
        System.out.println("\n" + intArray);

        intArray.remove(2);     //remove() elements
        System.out.println("\n" + intArray);

        Collections.swap(intArray, 0, 1);        //swap() the ArrayList
        System.out.println("\n" + intArray);

        Collections.sort(intArray);        //sort() the ArrayList
        System.out.println("\n" + intArray);

        Collections.reverse(intArray);        //reverse() the ArrayList
        System.out.println("\n" + intArray);
    }
}
