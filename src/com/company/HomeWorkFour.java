package com.company;

import java.util.Scanner;

public class HomeWorkFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int grade;

        System.out.print("Введите оценку: ");

        if (scanner.hasNextInt()) {

            number = scanner.nextInt();

            if (number <= 12 && number >= 10) {
                grade = 5;
            } else if (number <= 9 && number >= 7) {
                grade = 4;
            } else if (number <= 6 && number >= 4) {
                grade = 3;
            } else if (number <= 3 && number >= 1) {
                grade = 2;
            } else {
                System.out.printf("Оценку [ %d ] невозможно перевести в пятибалльную шкалу! %n", number);
                System.out.println("Проверьте вводимые данные и запустите снова!");

                scanner.close();

                return;
            }

        } else {
            System.out.println("Проверьте вводимые данные и запустите снова!");

            scanner.close();

            return;
        }

        System.out.printf("Оценка %d по пятибалльной шкале равна - %d %n", number, grade);

        scanner.close();

    }
}
