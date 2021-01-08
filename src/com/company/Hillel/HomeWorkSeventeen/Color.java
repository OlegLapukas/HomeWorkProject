package com.company.Hillel.HomeWorkSeventeen;

public enum Color {
    BLACK("Черный"),
    PINK("Розовый"),
    BLUE("Голубой"),
    RED("Красный"),
    GREEN("Зеленый"),
    YELLOW("Желтый"),
    ORANGE("Оранжевый"),
    GREY("Серый");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
