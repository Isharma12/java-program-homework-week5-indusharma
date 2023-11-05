package homework_week_9;

import java.util.ArrayList;

public class Programme_6RetrieveElementFromArrayList {
    public static void main(String[] args) {
        //Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        //Add some elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        //Index of the elements to retrieve
        int indexToRetrieve = 2; //Change this to the desired index

        //Check if the index is within the valid range
        if(indexToRetrieve >= 0 && indexToRetrieve < arrayList.size()){
            int element = arrayList.get(indexToRetrieve);
            System.out.println("Element at index" + indexToRetrieve + "is: " + element);
        }else{
            System.out.println("Index is out of range.Please provide a valid index.");
        }
    }
}
