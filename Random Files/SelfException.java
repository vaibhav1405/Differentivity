package com.bca3.practical;

import java.util.Scanner;


public class SelfException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = sc.next();
        System.out.print("Enter your age ");
        int age = sc.nextInt();
        try {
            if (age < 18)
                throw new InvalidAgeException();
            else {
                System.out.println("Your name is " + name);
                System.out.println("Your age is " + age);
            }
        } catch(InvalidAgeException e){
            System.err.println(e.getMessage());
        }
    }
}
class InvalidAgeException extends  Exception{
    InvalidAgeException(){
        super("You are below 18 years of age");
    }
}