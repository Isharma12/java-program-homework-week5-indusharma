package homework_week_9;

import java.util.HashSet;

public class Programme_8HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> integerSet = new HashSet<>();

        //Add numbers 4, 7 and 8 to the set
        integerSet.add(4);
        integerSet.add(7);
        integerSet.add(8);

        //Check which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++){
            if (integerSet.contains(i)){
                System.out.println(i + " is in the set. ");
            }else{
                System.out.println(i + " is not in the set. ");
            }
        }
    }
}
