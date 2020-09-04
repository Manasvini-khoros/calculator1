package com.company;

import java.util.Scanner;

public class Test {
    public int id;
    public String name;
    public void getInput1(){
        Scanner s =new Scanner(System.in);
        System.out.println("enter id:");
        id=s.nextInt();
        System.out.println("enter name:");
        s.nextLine();
        name=s.nextLine();
    }
    public void display1(){
        System.out.println("STUDENT ID : "+id);
        System.out.println("STUDENT NAME : "+name);
    }
}
