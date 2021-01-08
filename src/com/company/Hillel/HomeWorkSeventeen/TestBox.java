package com.company.Hillel.HomeWorkSeventeen;

public class TestBox {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(15);
        System.out.println(warehouse); //warehouse is empty

        Box box = new Box();
        warehouse.addBox(box);

        Box box1 = new Box(Material.ALUMINUM);
        warehouse.addBox(box1);

        Box box2 = new Box(35, 17, 27);
        warehouse.addBox(box2);

        Box box3 = new Box(30, 20, 25, Material.CARDBOARD);
        warehouse.addBox(box3);

        Box box4 = new Box();
        box4.setHeight(24);
        box4.setMaterial(Material.CARDBOARD);
        warehouse.addBox(box4);

        ColorBox colorBox = new ColorBox();
        warehouse.addBox(colorBox);

        ColorBox colorBox1 = new ColorBox(Material.CARDBOARD);
        warehouse.addBox(colorBox1);

        ColorBox colorBox2 = new ColorBox(Color.BLACK);
        warehouse.addBox(colorBox2);

        ColorBox colorBox3 = new ColorBox(Material.ALUMINUM, Color.GREEN);
        warehouse.addBox(colorBox3);

        ColorBox colorBox4 = new ColorBox(45, 25, 5);
        warehouse.addBox(colorBox4);

        ColorBox colorBox5 = new ColorBox(45, 20, 10, Material.IRON);
        warehouse.addBox(colorBox5);

        ColorBox colorBox6 = new ColorBox(45, 20, 10, Color.ORANGE);
        warehouse.addBox(colorBox6);

        ColorBox colorBox7 = new ColorBox(10, 20, 10, Material.IRON, Color.ORANGE);
        warehouse.addBox(colorBox7);

        ColorBox colorBox8 = new ColorBox();
        colorBox8.setColor(Color.BLUE);
        colorBox8.setMaterial(Material.IRON);
        warehouse.addBox(colorBox8);

        ColorBox colorBox9 = new ColorBox();
        colorBox9.setLength(25);
        warehouse.addBox(colorBox9);

        System.out.println(warehouse);

        warehouse.addBox(colorBox9); //warehouse is full
    }
}
