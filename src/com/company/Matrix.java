package com.company;

public class Matrix {

    public static void main(String[] args) throws InterruptedException {
        int[][] matrix = new int[10][10];

        initialize(matrix);

        System.out.println("Итоговый вид матрицы: ");
        printMatrix(matrix);

    }

    private static void initialize(int[][] matrix) throws InterruptedException {
        int count = 1;

        int a = 0;
        int b = 0;
        int c = 0;
        int d = matrix[0].length;
        int e = matrix[0].length;
        int f = matrix.length;
        int g = matrix.length;
        int h = 0;

        while (true) {

            if (count > (matrix.length * matrix[0].length)) {
                break;
            }

            for (int i = a; i < d; i++) {
                matrix[b][i] = count++;
                printMatrix(matrix);
                Thread.sleep(500);
            }
            a++;
            b++;
            c++;
            d--;

            if (count > (matrix.length * matrix[0].length)) {
                break;
            }

            for (int i = c; i < f; i++) {
                matrix[i][d] = count++;
                printMatrix(matrix);
                Thread.sleep(500);
            }

            e--;
            f--;

            if (count > (matrix.length * matrix[0].length)) {
                break;
            }

            for (int i = e - 1; i >= h; i--) {
                matrix[f][i] = count++;
                printMatrix(matrix);
                Thread.sleep(500);
            }


            g--;

            if (count > (matrix.length * matrix[0].length)) {
                break;
            }

            for (int i = g - 1; i >= b; i--) {
                matrix[i][h] = count++;
                printMatrix(matrix);
                Thread.sleep(500);
            }

            h++;
//            Thread.sleep(1000);

        }

    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%4d", anInt);
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
