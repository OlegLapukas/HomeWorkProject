package com.company.Hillel.HomeWorkSeventeen;

import java.util.Arrays;

public class Warehouse {

    private static final String line = "Объём коробки равен = %.4f м³.%n";

    Box[] boxes;
    private int count = 0;

    public Warehouse(int length) {
        boxes = new Box[length];
    }

    public void addBox(Box box) {
        if (count < boxes.length) {
            boxes[count] = box;
            count++;
        } else {
            System.out.println("Склад заполнен!");
        }
    }

    @Override
    public String toString() {
        if (count == 0) {
            return "Склад пуст!\n";
        }
        StringBuilder sb = new StringBuilder("Содержимое склада:\n");
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] != null) {
                sb.append("Коробка хранится в ячейке:").append(i).append("\n");
                sb.append(String.format(line, boxes[i].volume()));
                sb.append(boxes[i]).append("\n");
            }
        }
        return sb.toString();
    }
}
