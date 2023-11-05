package homework_week_9;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Programme_3ReverseArray {
    public static void main(String[] args) {
        int[] originalArray ={1,2,3,4,5};
        System.out.println("Original Array: ");
        printArray(originalArray);

        int[] reverseArray = reverse(originalArray);
        System.out.println("Reversed Array: ");
        printArray(reverseArray);
    }
    public static int[] reverse(int[]arr){
        int length = arr.length;
        int[]reversed = new int[length];

        for(int i = 0; i <length; i++){
            reversed[i] = arr[length - 1 - i];
        }
        return reversed;
    }
    public static void printArray(int[] arr){
        for (int num : arr){
            System.out.println(num + " ");
        }
        System.out.println();
    }

}
