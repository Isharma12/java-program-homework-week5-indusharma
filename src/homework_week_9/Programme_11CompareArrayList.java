package homework_week_9;

import java.util.ArrayList;

/**
 *  Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();

        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();

        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //For loop using for compare
        for(int i = 0; i <c1.size(); i++){
            if(c2.contains(c1.get(i))){
                //if statement exist inc2 it will be print on console
                System.out.println("Exist in c2" + c1.get(i));
            }else{
                //if elements do not exist in c2 it will not allow to print in the console
                System.out.println("Not exist in c2 " + c1.get(i));
            }
        }

    }
}
