package com.bca3.practical;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatrixMultiplication {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j, s;
        int row1, column1, row2, column2;
        int[][] matrix1 = new int[10][10];
        int[][] matrix2 = new int[10][10];
        int[][] multipliedMatrix = new int[10][10];
        System.out.print("Enter no. of Row of First Matrix->");
        row1 = Integer.parseInt(br.readLine());
        System.out.print("Enter no. of Column of First Matrix->");
        column1 = Integer.parseInt(br.readLine());
        System.out.print("Enter no. of Row of Second Matrix->");
        row2 = Integer.parseInt(br.readLine());
        System.out.print("Enter no. of Column of Second Matrix->");
        column2 = Integer.parseInt(br.readLine());
        if (column1 != row2) {
            System.out.println("\n\nMatrix Multiplication failed.");
            System.exit(1);
        }
        System.out.println("Enter Elements for First Matrix ");
        for (i = 0; i < row1; i++)
            for (j = 0; j < column1; j++)
                matrix1[i][j] = Integer.parseInt(br.readLine());

        System.out.println("Enter Elements for Second Matrix");
        for (i = 0; i < row2; i++)
            for (j = 0; j < column2; j++)
                matrix2[i][j] = Integer.parseInt(br.readLine());



        for (i = 0; i < row1; i++) {
            for (j = 0; j < column2; j++) {
                multipliedMatrix[i][j] = 0;
                for (s = 0; s < column1; s++)
                    multipliedMatrix[i][j] += matrix1[i][s] * matrix2[s][j];
            }
        }
        System.out.println("First Matrix:");
        show(row1, column1, matrix1);
        System.out.println("Second Matrix:");
        show(row2, column2, matrix2);
        System.out.println("Multiplied Matrix:");
        show(row1, column2, multipliedMatrix);


    }

    public static void show(int n, int m, int[][] matrix1) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
