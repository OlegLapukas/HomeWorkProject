package com.company.Hillel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWorkEight {

    public static void main(String[] args) {

        int size;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер массива в диапазоне от 1 до 100: ");
            size = scanner.nextInt();

            if (size > 100 || size < 1) {
                System.out.println("Размер вне диапазона! Запустите снова и повторите ввод!");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Проверьте вводимые данные и запустите снова!");
            return;
        }

        double[] array = initialize(size);
        //System.out.println(Arrays.toString(array));

        double maxValue = max(array);
        System.out.printf("Максимальный элемент массива: %.2f%n", maxValue);

        double minValue = min(array);
        System.out.printf("Минимальный элемент массива: %.2f%n", minValue);

        double averageArithmetic = average(array);
        System.out.printf("Среднее арифметическое элементов массива: %.2f%n", averageArithmetic);

    }

    static double[] initialize(int size) {

        double[] array = new double[size];

        double value;

        for (int i = 0; i < array.length; i++) {
            value = (Math.random() - 0.5) * 10000;
            array[i] = (double) Math.round(value) / 100;
        }

        return array;
    }

    static double max(double[] array) {
        double max = array[0];

        for (double v : array) {
            if (v > max) {
                max = v;
            }
        }

        return max;
    }

    static double min(double[] array) {
        double min = array[0];

        for (double v : array) {
            if (v < min) {
                min = v;
            }
        }

        return min;
    }

    static double average(double[] array) {
        double d = 0;

        for (double v : array) {
            d += v;
        }

        d /= array.length;

        return d;
    }
}
