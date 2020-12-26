package com.company.Hillel;

import java.util.Locale;
import java.util.Scanner;

public class HomeWorkSecond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("Введите ваш вес: ");
        double weight;

        if (scanner.hasNextDouble()) {
            weight = scanner.nextDouble();
        } else {
            System.out.println("Проверьте вводимые данные и запустите снова!");
            scanner.close();
            return;
        }

        System.out.print("Введите ваш рост: ");
        double height;

        if (scanner.hasNextDouble()) {
            height = scanner.nextDouble();
        } else {
            System.out.println("Проверьте вводимые данные и запустите снова!");
            scanner.close();
            return;
        }

        double bodyMassIndex = weight / (height * height);

        System.out.printf("Ваш индекс массы тела: [ %.1f ] %n", bodyMassIndex);

        System.out.println("\nИнтерпретация показателей ИМТ:");
        System.out.printf("%17s | %47s |%n", "Индекс массы тела", "Соответствие между массой человека и его ростом");
        System.out.println("------------------|-------------------------------------------------|");
        System.out.printf("%-17s | %-47s |%n", "16 и менее", "Выраженный дефицит массы тела");
        System.out.printf("%-17s | %-47s |%n", "16—18,5", "Недостаточная (дефицит) масса тела");
        System.out.printf("%-17s | %-47s |%n", "18,5—25", "Норма");
        System.out.printf("%-17s | %-47s |%n", "25—30", "Избыточная масса тела (предожирение)");
        System.out.printf("%-17s | %-47s |%n", "30—35", "Ожирение");
        System.out.printf("%-17s | %-47s |%n", "35—40", "Ожирение резкое");
        System.out.printf("%-17s | %-47s |%n", "40 и более", "Очень резкое ожирение");
        System.out.println("--------------------------------------------------------------------|");


        scanner.close();
    }
}
