package com.company.Hillel.HomeWorkFourteen;

public class TestBox {

    public static void main(String[] args) {
        String line = "Объём коробки равен = %.4f м³.%n";

        Box smallBox = new Box(10, 10, 7);
        System.out.printf(line, smallBox.volume());
        System.out.println(smallBox);

        Box defaultBox = new Box();
        System.out.printf(line, defaultBox.volume());
        System.out.println(defaultBox);

        Box bigBox = new Box(150, 200, 275);
        System.out.printf(line, bigBox.volume());
        System.out.println(bigBox);

        Box unusualBox = new Box();
        unusualBox.setHeight(17);
        unusualBox.setLength(7);
        unusualBox.setWidth(23);
        System.out.printf(line, unusualBox.volume());
        System.out.println(unusualBox);

        Box box = new Box(5,5,5);
        System.out.printf(line, box.volume());
        System.out.println(box);

    }
}
