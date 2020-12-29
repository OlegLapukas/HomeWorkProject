package com.company.Hillel.HomeWorkFiveteen;

public class Box {

    //default size
    private int height = 50;
    private int width = 50;
    private int length = 50;

    private String material = "дерево"; //default material
    private String color = "розовый"; //default color

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

    public Box(int height, int width, int length, String material, String color) {
        this(height, width, length);
        this.material = material;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            System.out.println("Это значение не может быть устновлено");
        } else {
            this.height = height;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            System.out.println("Это значение не может быть устновлено");
        } else {
            this.width = width;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0) {
            System.out.println("Это значение не может быть устновлено");
        } else {
            this.length = length;
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                "Материал: %s%n" +
                "Цвет: %s%n", height, width, length, material, color);
    }
}
