package com.company;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class HomeWorkFive {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            scanner.useLocale(Locale.ENGLISH);

            double a;
            double b;
            double c;

            System.out.print("Введите длину стороны \"а\" треугольника: ");
            a = scanner.nextDouble();

            System.out.print("Введите длину стороны \"b\" треугольника: ");
            b = scanner.nextDouble();

            System.out.print("Введите длину стороны \"c\" треугольника: ");
            c = scanner.nextDouble();

            if ((a < b + c) && (b < a + c) && (c < a + b)) {
                System.out.println("Из этих отрезков можно построить треугольник!");
            } else {
                System.out.println("Сожалеем! - Из этих отрезков невозможно построить треугольник!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Проверьте вводимые данные и попробуйте снова!");
        }
    }
}
