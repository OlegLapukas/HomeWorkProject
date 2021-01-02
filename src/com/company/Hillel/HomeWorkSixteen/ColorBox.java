package com.company.Hillel.HomeWorkSixteen;

public class ColorBox extends Box {
    private Color color = Color.GREY; //default color

    public ColorBox() {
    }

    public ColorBox(Color color) {
        this.color = color;
    }

    public ColorBox(int height, int width, int length, Color color) {
        super(height, width, length);
        this.color = color;
    }

    public ColorBox(int height, int width, int length, Material material, Color color) {
        super(height, width, length, material);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nЦвет: " + color;
    }
}