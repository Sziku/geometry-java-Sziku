package com.codecool.geometry.shapes;

public class Rectangle extends Shape {
    private double a;
    private double b;
    private double area;
    private double parimeter;
    private String parimeterFormula = "2×a+2×b";
    private String areaFormula = "a×b";

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a) {
        this.a = a;
        this.b = a;
    }

    @Override
    public double calculateArea() {
        area = a*b;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        parimeter = 2*a+2*b;
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
        return "Rectangle, " + "a = " + a + ", b = " + b;
    }
}
