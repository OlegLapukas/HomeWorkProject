package com.company.Hillel.HomeWorkSixteen;

public class TestBox {

    public static void main(String[] args) {
        String line = "Объём коробки равен = %.4f м³.%n";

        Box defaultBox = new Box();
        System.out.printf(line, defaultBox.volume());
        System.out.println(defaultBox);
    }
}
