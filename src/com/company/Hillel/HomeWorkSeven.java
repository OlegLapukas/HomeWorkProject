package com.company.Hillel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWorkSeven {
    static int inputCount;

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите количество подходов для подтягивания: ");
            inputCount = scanner.nextInt();

            if (inputCount <= 0) {
                System.out.println("Значение <= 0. Повторите ввод!");
                return;
            }

        } catch (InputMismatchException e) {
            System.out.println("Проверьте вводимые данные и запустите снова!");
            return;
        }

        int pullUpTime = 0;
        int lastRecreationTime = 0;
        int allRelaxTime = 0;
        int allCountUp = 0;

        for (int i = 0; i < inputCount; i++) {

            for (int j = 0; j <= i; j++) {
                pullUpTime += 5;
                allCountUp++;
            }

            if (i > 0) {
                lastRecreationTime = (int) (lastRecreationTime + lastRecreationTime * 0.2);
                allRelaxTime += lastRecreationTime;
            } else {
                allRelaxTime = 60;
                lastRecreationTime = 60;
            }
        }

        int allTimeWorkOut = pullUpTime + allRelaxTime;
        int min = allTimeWorkOut / 60;
        int sec = allTimeWorkOut - min * 60;

        System.out.println("Количество сделанных подтягиваний: " + allCountUp);
        System.out.printf("Время = %02d:%02d%n", min, sec);
    }
}
