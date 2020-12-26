package com.company.Hillel;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWorkTen {

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
        maxValue(array);

    }

    private static void maxValue(int[] array) {
        int number = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > number) {
                number = Math.abs(array[i]);
                index = i;
            }
        }

        System.out.printf("Максимальный по модулю элемент: %d. Его индекс в массиве: %d", array[index], index);
    }

    private static void printArray(int[] array) {
        System.out.println("Итоговый вид массива после заполнения его значениями: ");
        System.out.println(Arrays.toString(array));
    }

    private static int[] initialize(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; ) {
            int value = (int)((Math.random() - 0.5) * 100);
            boolean notContains = true;

            for (int k = 1; k <= i; k++) {
                if (Math.abs(value) == Math.abs(array[k - 1])) {
                    notContains = false;
                    break;
                }
            }

            if (notContains) {
                array[i] = value;
                i++;
            }
        }

        return array;
    }
}
