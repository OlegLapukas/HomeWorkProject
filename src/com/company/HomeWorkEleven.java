package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWorkEleven {

    public static void main(String[] args) {

        int size;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            size = scanner.nextInt();

            if (size < 0) {
                System.out.println("Массив не может быть отрицательным. Запустите снова и повторите ввод.");
                return;
            } else if (size == 0) {
                System.out.println("Нулевой массив не имеет смысла.");
                return;
            }

        } catch (InputMismatchException e) {
            System.out.println("Проверьте вводимые данные и запустите снова!");
            return;
        }

        int[] array = initialize(size);
        printArray(array);
        allDigits(array);

    }

    private static void allDigits(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            int number = array[i];

            do {
                sum += number % 10;
                number /= 10;
            } while (number != 0);
        }

        System.out.printf("Сумма цифр массива: %d", sum);
    }

    private static void printArray(int[] array) {
        System.out.println("Итоговый вид массива после заполнения его значениями: ");
        System.out.println(Arrays.toString(array));
    }

    private static int[] initialize(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }

        return array;
    }
}
