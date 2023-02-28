package com.codecool.geometry.shapes;

public class Circle extends Shape {
    private double radius;
    private double area;
    private double parimeter;
    private String parimeterFormula = "2×π×r";
    private String areaFormula = "π×r×r";


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        area = radius * radius * Math.PI;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        parimeter = 2 * radius * Math.PI;
        return parimeter;
    }

    @Override
    public String getPerimeterFormula() {
        return parimeterFormula;
    }

    @Override
    public String getPerimeter() {
        return String.valueOf(parimeter);
    }

    @Override
    public String getAreaFormula() {
        return areaFormula;
    }

    @Override
    public String getArea() {
        return String.valueOf(area);
    }

    @Override
    public String toString() {
        return "Circle, " +
                "r = " + radius;
    }
}
