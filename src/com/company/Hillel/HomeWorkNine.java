package com.company.Hillel;

public class HomeWorkNine {

    public static void main(String[] args) {

        int[][] matrix = new int[7][4];

        initialize(matrix);
        printArrays(matrix);
        arraysModule(matrix);

    }

    private static void initialize(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int count = (int) Math.round((Math.random() - 0.5) * 10);
                matrix[i][j] = count;
            }
        }
    }

    private static void printArrays(int[][] matrix) {
        System.out.println("Вывод двумерного массива: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("Строка с индексом %d - {", i);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println("  }");
        }
    }

    private static void arraysModule(int[][] matrix) {
        int index = 0;
        int value = 0;

        for (int i = 0; i < matrix.length; i++) {
            int maxValue = 1;
            for (int j = 0; j < matrix[i].length; j++) {
                maxValue *= matrix[i][j];
            }

            if (Math.abs(maxValue) > value) {
                value = Math.abs(maxValue);
                index = i;
            }
        }
        System.out.printf("Строка с наибольшим по модулю произведением элементов имеет индекс: [%d], со значением [%d]",
                index, value);

    }
}
