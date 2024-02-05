package HackerRank;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringDoubleIntInputAndReverseOutput {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Int");
        int i = scan.nextInt();
        System.out.println("Double");
        double d = scan.nextDouble();
        System.out.println("String");
        String s = bufferedReader.readLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

/*
public static void main(String[] args) throws IOException {
       Scanner scan = new Scanner(System.in);

       System.out.println("Int");
       int i = scan.nextInt();
       System.out.println("Double");
       double d = scan.nextDouble();
       System.out.println("String");
       String s = scan.nextLine();
       s = scan.nextLine();

       System.out.println("String: " + s);
       System.out.println("Double: " + d);
       System.out.println("Int: " + i);


*/
