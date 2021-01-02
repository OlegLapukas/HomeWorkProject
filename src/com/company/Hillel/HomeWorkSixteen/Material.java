package com.company.Hillel.HomeWorkSixteen;

public enum Material {
    WOOD("Дерево"),
    IRON("Железо"),
    ALUMINUM("Алюминий"),
    CARDBOARD("Картон");

    private final String material;

    Material(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material;
    }
}
