package com.bca3.practical;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatrixAddition {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j;
        int row, column;
        int[][] matrix1 = new int[10][10];
        int[][] matrix2 = new int[10][10];
        int[][] addedMatrix = new int[10][10];
        System.out.print("Enter no. of Row of Matrices : ");
        row = Integer.parseInt(br.readLine());
        System.out.print("Enter no. of Column of Matrices : ");
        column = Integer.parseInt(br.readLine());

        System.out.println("Enter Elements for First Matrix ");
        for (i = 0; i < row; i++)
            for (j = 0; j < column; j++)
                matrix1[i][j] = Integer.parseInt(br.readLine());

        System.out.println("Enter Elements for Second Matrix");
        for (i = 0; i < row; i++)
            for (j = 0; j < column; j++)
                matrix2[i][j] = Integer.parseInt(br.readLine());



        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                addedMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("First Matrix:");
        show(row, column, matrix1);
        System.out.println("Second Matrix:");
        show(row, column, matrix2);
        System.out.println("Multiplied Matrix:");
        show(row, column, addedMatrix);


    }

    public static void show(int m, int n, int[][] matrix) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
