package com.bca3.practical;

class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        int f1, f2 = 0, f3 = 1, i = 1;
        do {
            System.out.print(" " + f3 + " ");
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
            i++;
        } while (i <= 10);
    }
}


