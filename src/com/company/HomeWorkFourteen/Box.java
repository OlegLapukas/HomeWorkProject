package com.company.HomeWorkFourteen;

public class Box {

    private int height;
    private int width;
    private int length;

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box() {
        //Object with default values
        this(50, 50, 50);
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

    public double volume() {
        return (double) (this.height * this.length * this.width) / 1e6;
    }

    @Override
    public String toString() {
        return String.format("Коробка имеет размеры в см - %n" +
                "высота: %d%n" +
                "ширина: %d%n" +
                "длинна: %d%n", height, width, length);
    }
}
