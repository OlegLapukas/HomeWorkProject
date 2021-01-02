package com.company.Hillel.HomeWorkSixteen;

public class Box {

    //default size
    private int height = 50;
    private int width = 50;
    private int length = 50;

    private Material material = Material.WOOD; //default material

    public Box() {
        //Object with default values
    }

    public Box(int height, int width, int length) {
        if (height <= 0 || width <= 0 || length <= 0) {
            System.out.println("Значения для коробки не могут быть меньше либо равны нулю!" +
                    "Будет создана коробка с дефолтными значениями!");
        } else {
            this.height = height;
            this.width = width;
            this.length = length;
        }
    }

    public Box(int height, int width, int length, Material material) {
        this(height, width, length);
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            System.out.println("Это значение не может быть установлено!");
        } else {
            this.height = height;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            System.out.println("Это значение не может быть установлено!");
        } else {
            this.width = width;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0) {
            System.out.println("Это значение не может быть установлено!");
        } else {
            this.length = length;
        }
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double volume() {
        return (double) (this.height * this.length * this.width) / 1e6;
    }

    @Override
    public String toString() {
        return String.format("Коробка имеет размеры в см - %n" +
                "высота: %d%n" +
                "ширина: %d%n" +
                "длинна: %d%n" +
                "Материал: %s%n", height, width, length, material);
    }
}
