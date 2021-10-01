package com.bca3.practical;

import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter a number to check Armstrong or not ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int check = 0, remainder;
        while (num > 0) {
            remainder = num % 10;
            check = check + (int) Math.pow(remainder, 3);
            num = num / 10;
        }
        if (check == n)
            System.out.print(n +" is an Armstrong Number");
        else
            System.out.print(n +" is not an Armstrong Number");
    }
}