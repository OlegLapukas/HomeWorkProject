package com.company.Hillel.HomeWorkSixteen;

import com.company.Hillel.HomeWorkFiveteen.Box;

public class TestBox {

    public static void main(String[] args) {
        String line = "Объём коробки равен = %.4f м³.%n";

        com.company.Hillel.HomeWorkFiveteen.Box defaultBox = new com.company.Hillel.HomeWorkFiveteen.Box();
        System.out.printf(line, defaultBox.volume());
        System.out.println(defaultBox);

        com.company.Hillel.HomeWorkFiveteen.Box smallBox = new com.company.Hillel.HomeWorkFiveteen.Box(10, 10, 7);
        System.out.printf(line, smallBox.volume());
        System.out.println(smallBox);

        com.company.Hillel.HomeWorkFiveteen.Box bigBox = new com.company.Hillel.HomeWorkFiveteen.Box(150, 200, 275);
        System.out.printf(line, bigBox.volume());
        System.out.println(bigBox);

        com.company.Hillel.HomeWorkFiveteen.Box unusualBox = new com.company.Hillel.HomeWorkFiveteen.Box();
        unusualBox.setHeight(17);
        unusualBox.setLength(7);
        unusualBox.setWidth(23);
        unusualBox.setMaterial("алюминий");
        unusualBox.setColor("синий");
        System.out.printf(line, unusualBox.volume());
        System.out.println(unusualBox);

        com.company.Hillel.HomeWorkFiveteen.Box box = new com.company.Hillel.HomeWorkFiveteen.Box(5, 5, 5, "картон", "черный");
        System.out.printf(line, box.volume());
        System.out.println(box);

        com.company.Hillel.HomeWorkFiveteen.Box badBox = new com.company.Hillel.HomeWorkFiveteen.Box(0, -24, 2);
        System.out.println(badBox);

        com.company.Hillel.HomeWorkFiveteen.Box badBox2 = new com.company.Hillel.HomeWorkFiveteen.Box(0, -24, 2, "бумага", "пурпурный");
        System.out.println(badBox2);

        com.company.Hillel.HomeWorkFiveteen.Box badBox3 = new Box();
        badBox2.setHeight(0);
        System.out.println(badBox3);
    }
}
