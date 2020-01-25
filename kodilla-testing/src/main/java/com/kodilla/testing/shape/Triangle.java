package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private final static String name = "Triangle";
    private double side;
    private double hight;

    public Triangle(double side, double hight) {
        this.side = side;
        this.hight = hight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.side, side) == 0 &&
                Double.compare(triangle.hight, hight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side, hight);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return side*hight/2;
    }
}
