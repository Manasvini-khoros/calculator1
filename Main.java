package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
       // System.out.println("hellooo");
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=s.nextInt();
        System.out.println("enter second number:");
        int b=s.nextInt();
        add(a,b);
        sub(a,b);
        mul(a,b);
        div(a,b);
    }

    private static void add(int a, int b) {
        System.out.println("sum is : "+(a+b));
    }

    private static void sub(int a, int b) {
        System.out.println("diff is : "+(a-b));
    }

    private static void mul(int a, int b) {
        System.out.println("product is : "+(a*b));
    }

    private static void div(int a, int b) {
        System.out.println("quotient is : "+(a/b));
    }
}
