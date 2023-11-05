package homework_week_9;

import java.util.Scanner;

/**
 *Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */
public class Programme_2 {
    //calculate sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //calculate result for pass or fail
    public static String calcResult(int mathsMarks, int scienceMarks, int englishMarks) {
        while (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        }
        return "Pass";
    }

    //calculate percentage and grade
    public static String gradeCheck(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = "-";
            }
        }
        return grade;
    }

    // Print mark sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("+---------------------------------+");
        System.out.println("|                                 |");
        System.out.println("|           Mark Sheet            |");
        System.out.println("|_________________________________|");
        System.out.println("| Name       : " + name + "                |");
        System.out.println("| Roll No    : " + rollNum + "                |");
        System.out.println("|_________________________________|");
        System.out.println("| Subjects   : Marks              |");
        System.out.println("|_________________________________|");
        System.out.println("| Math       : " + mathsMarks + "                   |");
        System.out.println("| Science    : " + scienceMarks + "                |");
        System.out.println("| English    : " + englishMarks + "                |");
        System.out.println("|_________________________________|");
        System.out.println("| Total      : " + total + "             |");
        System.out.println("|_________________________________|");
        System.out.println("| Percentage : " + percentage + "           |");
        System.out.println("| Result     : " + result + "               |");
        System.out.println("| Grade      : " + grade + "                  |");
        System.out.println("|---------------------------------+");
    }

    public static void main(String[] args) {

        // Scanner declaration for reading input formm console
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Student Name        \t\t:\t");
        String name = sc.next();
        System.out.print("\nEnter student Roll Number  \t:\t");
        int rollNum = sc.nextInt();

        System.out.print("\nEnter Marks of subject Maths \t:\t");
        int mathsMarks = sc.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("\nInvalid input. Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            mathsMarks = sc.nextInt();
        }

        System.out.print("\nEnter Marks of subject Science \t:\t");
        int scienceMarks = sc.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\nInvalid input. Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            scienceMarks = sc.nextInt();
        }

        System.out.print("\nEnter Marks of subject English \t:\t");
        int englishMarks = sc.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("\nInvalid input. Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            englishMarks = sc.nextInt();
        }

        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calcResult(mathsMarks, scienceMarks, englishMarks);
        String grade = gradeCheck(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        //Closing the scanner object
        sc.close();
    }

}
