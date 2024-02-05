package HackerRank;

import java.util.Scanner;

public class EvenOrNot {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        if ((n % 2 != 0) || (n >= 6 && n <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
    //  Another way to write Program

    /*   private static final Scanner scanner = new Scanner(System.in);

            public static void main(String[] args) {

                System.out.println("Enter the integer number");
                int inputNumber = scanner.nextInt();
                EvenOrNot evenOrNot = new EvenOrNot();
                evenOrNot.findEvenOrOdd(inputNumber);
            }

            public String findEvenOrOdd(int inputNumber) {

                int remainder = inputNumber % 2;
                String result = "";
                System.out.println("Input is : " + inputNumber);
                if (remainder != 0) {
                    System.out.println("Result is : Weird");
                    result = "Weird";
                } else {
                    if (inputNumber >= 2 & inputNumber <= 5) {
                        System.out.println("Result is : Not Weird");
                        result = "Not Weird";
                    } else if (inputNumber >= 6 & inputNumber <= 20) {
                        System.out.println("Result is : Weird");
                        result = "Weird";
                    } else if (inputNumber > 20) {
                        System.out.println("Result is : Not Weird");
                        result = "Not Weird";
                    }
                }
                scanner.close();
                return result;
            }
         }
    */
}
