package com.company.Hillel.HomeWorkSeventeen;

import java.util.Arrays;

public class Warehouse {
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
        StringBuilder sb = new StringBuilder("Содержимое склада:\n");
        for (Box box : boxes) {
            if (box != null) {
                sb.append(box);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
