package com.company.Hillel.HomeWorkFiveteen;

public class TestBox {

    public static void main(String[] args) {
        String line = "Объём коробки равен = %.4f м³.%n";

        Box defaultBox = new Box();
        System.out.printf(line, defaultBox.volume());
        System.out.println(defaultBox);

        Box smallBox = new Box(10, 10, 7);
        System.out.printf(line, smallBox.volume());
        System.out.println(smallBox);

        Box bigBox = new Box(150, 200, 275);
        System.out.printf(line, bigBox.volume());
        System.out.println(bigBox);

        Box unusualBox = new Box();
        unusualBox.setHeight(17);
        unusualBox.setLength(7);
        unusualBox.setWidth(23);
        unusualBox.setMaterial("алюминий");
        unusualBox.setColor("синий");
        System.out.printf(line, unusualBox.volume());
        System.out.println(unusualBox);

        Box box = new Box(5, 5, 5, "картон", "черный");
        System.out.printf(line, box.volume());
        System.out.println(box);

        Box badBox = new Box(0, -24, 2);
        System.out.println(badBox);

        Box badBox2 = new Box(0, -24, 2, "бумага", "пурпурный");
        System.out.println(badBox2);

        Box badBox3 = new Box();
        badBox2.setHeight(0);
        System.out.println(badBox3);
    }
}
