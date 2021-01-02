package com.company.Hillel.HomeWorkSixteen;

public class TestBox {

    public static void main(String[] args) {
        String line = "Объём коробки равен = %.4f м³.%n";

        Box box = new Box();
        System.out.printf(line, box.volume());
        System.out.println(box);

        Box box1 = new Box(Material.ALUMINUM);
        System.out.printf(line, box1.volume());
        System.out.println(box1);

        Box box2 = new Box(35,17,27);
        System.out.printf(line, box2.volume());
        System.out.println(box2);

        Box box3= new Box(30,20,25, Material.CARDBOARD);
        System.out.printf(line, box3.volume());
        System.out.println(box3);

        ColorBox colorBox = new ColorBox();
        System.out.printf(line, colorBox.volume());
        System.out.println(colorBox);

        ColorBox colorBox1 = new ColorBox(Material.CARDBOARD);
        System.out.printf(line, colorBox1.volume());
        System.out.println(colorBox1);

        ColorBox colorBox2 = new ColorBox(Color.BLACK);
        System.out.printf(line, colorBox2.volume());
        System.out.println(colorBox2);

        ColorBox colorBox3 = new ColorBox(Material.ALUMINUM, Color.GREEN);
        System.out.printf(line, colorBox3.volume());
        System.out.println(colorBox3);

        ColorBox colorBox4 = new ColorBox(45, 25, 5);
        System.out.printf(line, colorBox4.volume());
        System.out.println(colorBox4);

        ColorBox colorBox5 = new ColorBox(45, 20, 10, Material.IRON);
        System.out.printf(line, colorBox5.volume());
        System.out.println(colorBox5);

        ColorBox colorBox6 = new ColorBox(45, 20, 10, Color.ORANGE);
        System.out.printf(line, colorBox6.volume());
        System.out.println(colorBox6);

        ColorBox colorBox7 = new ColorBox(10, 20, 10, Material.IRON , Color.ORANGE);
        System.out.printf(line, colorBox7.volume());
        System.out.println(colorBox7);

        ColorBox colorBox8 = new ColorBox();
        colorBox8.setColor(Color.BLUE);
        colorBox8.setMaterial(Material.IRON);
        System.out.printf(line, colorBox8.volume());
        System.out.println(colorBox8);
    }
}
