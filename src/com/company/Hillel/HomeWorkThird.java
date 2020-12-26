package com.company.Hillel;

import java.util.Scanner;

public class HomeWorkThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.print("Введите третье число: ");
        double c = scanner.nextDouble();

        double oneExample = a + b * c / 2;
        double secondExample = (a * a + b * b) / 2;
        double thirdExample = (a + b) / 12 * c % 4 + b;
        double fourExample = (a - b * c) / (a + b) % c;

        System.out.printf("%n%-21s %-30s равен: %f",
                "Результат выражения:", "\"a + b * c / 2\"", oneExample);

        System.out.printf("%n%-21s %-30s равен: %f",
                "Результат выражения:", "\"(a * a + b * b) / 2\"", secondExample);

        System.out.printf("%n%-21s %-30s равен: %f",
                "Результат выражения:", "\"(a + b) / 12 * c % 4 + b\"", thirdExample);

        System.out.printf("%n%-21s %-30s равен: %f",
                "Результат выражения:", "\"(a - b * c) / (a + b) % c\"", fourExample);

        scanner.close();
    }
}
