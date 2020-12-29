package com.company.Hillel.HomeWorkFiveteen;

public class Box {

    private int height;
    private int width;
    private int length;
    private String material = "wood"; //default material
    private String color = "pink"; //default color

    public Box() {
        //Object with default values
        this(50, 50, 50);
    }

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box(int height, int width, int length, String material, String color) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.material = material;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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
                "материал %s%n" +
                "цвет %s%n", height, width, length, material, color);
    }
}
