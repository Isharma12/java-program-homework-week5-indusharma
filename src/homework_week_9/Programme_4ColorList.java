package homework_week_9;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Programme_4ColorList {
    public static void main(String[] args) {
        //Create a new Arraylist to store color strings
        List<String> colorList = new ArrayList<>();

        //Add some color string to the ArrayList
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Purple");

        //Print out the collection using a for-each loop
        System.out.println("Colors in the ArrayList");
        for (String color : colorList) {
            System.out.println(color);
        }
    }
}
