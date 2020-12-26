package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkThirteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        int size;
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
            if (size < 0) {
                System.out.println("Массива не может быть отрицтельным.");
                return;
            }

            if (size == 0) {
                System.out.println("Нулевой массив не имеет смысла.");
                return;
            }
        } else {
            System.out.println("Проверьте вводимые данные и запустите снова!");
            return;
        }

        int[] array = initializeArray(size);

        System.out.println("Вид не отсортированного массива:");
        System.out.println(Arrays.toString(array));

        selectionSort(array);

        System.out.println("Вид отсортированного массива:");
        System.out.println(Arrays.toString(array));

    }

    private static int[] initializeArray(int length) {
        Random random = new Random();
        return random.ints(length, -100, 100).toArray();
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            if (index != i) {
                swap(array, i, index);
            }
        }
    }

    private static void swap(int[] array, int a, int b) {
        int c = array[a];
        array[a] = array[b];
        array[b] = c;
    }
}
