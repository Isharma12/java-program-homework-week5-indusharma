package homework_week_9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

public class Programme_5ArrayListIteratorExample {
    public static void main(String[] args) {
        //Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        //Add elements to the ArrayList

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");


        //Create an Iterator through the ArrayList
        Iterator<String> iterator = arrayList.iterator();

        //Iterate through the ArrayList using the Iterator
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }



    }
}
