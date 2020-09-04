package com.company;

import java.util.Scanner;

public class Calculator {
    int a;
    int b;
    public void getInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number:");
        a = s.nextInt();
        System.out.println("enter second number:");
        b = s.nextInt();
    }
    public void add(){
        System.out.println("sum is : "+(a+b));
    }
    public void sub(){
        System.out.println("diff is : "+(a-b));
    }
    public void mul(){
        System.out.println("mul is : "+(a*b));
    }
    public void div(){
        System.out.println("quotient is : "+(a/b));
    }
}

