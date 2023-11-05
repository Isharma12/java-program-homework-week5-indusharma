package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */

public class Programme_7ArrayListIsEmptyTest {
    public static void main(String[] args) {
        //Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        //Add elements to the ArrayList
        arrayList.add("Element 1");
        arrayList.add("Element 2");

        //Check if the ArrayList is empty
        if (arrayList.isEmpty()){
            System.out.println("ArrayList is empty. ");
        }else{
            System.out.println("ArrayList is not empty.");
        }

        //Clear the ArrayList
        arrayList.clear();

        //Check if the ArrayList is empty after clearing
        if (arrayList.isEmpty()){
            System.out.println("ArrayList is empty.");
        }else{
            System.out.println("Array is not empty.");
        }
    }
}
