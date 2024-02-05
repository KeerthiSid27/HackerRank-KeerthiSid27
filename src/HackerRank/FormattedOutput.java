package HackerRank;

import java.util.Scanner;

public class FormattedOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            System.out.printf("%-15s", s1);
            // System.out.printf("%-15s", "");
            System.out.printf("%03d%n", x);
            // System.out.printf("%-15s%n", x);

        }
        System.out.println("================================");
    }
}
