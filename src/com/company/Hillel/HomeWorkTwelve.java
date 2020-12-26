package com.company.Hillel;

import java.util.Scanner;

public class HomeWorkTwelve {

    public static void main(String[] args) {

        System.out.print("Введите первое число: ");
        int numberOne = inputNumber();

        System.out.print("Введите второе число: ");
        int numberTwo = inputNumber();

        System.out.print("Введите необходимую операцию: ");
        char c = symbol();

        System.out.print("Результат: ");
        switch (c) {
            case '+':
                System.out.println(add(numberOne, numberTwo));
                break;
            case '-':
                System.out.println(minus(numberOne, numberTwo));
                break;
            case '*':
                System.out.println(multiply(numberOne, numberTwo));
                break;
            case '/':
                System.out.println(divide(numberOne, numberTwo));
                break;
        }
    }

    private static int inputNumber() {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.print("Это не целое число!\nПовторите ввод целого числа: ");
            return inputNumber();
        }
    }

    private static char symbol() {
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.nextLine();
        char c;

        switch (symbol) {
            case "-":
                c = '-';
                break;
            case "+":
                c = '+';
                break;
            case "*":
                c = '*';
                break;
            case "/":
                c = '/';
                break;
            default:
                System.out.print("Неверный символ!\nПовторите ввод: ");
                return symbol();
        }
        return c;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        if (b == 0) {
            System.out.print("На 0 делить нельзя!\nЗемените второе число: ");
            b = inputNumber();
            System.out.print("Результат: ");
        }
        return a / b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }
}
