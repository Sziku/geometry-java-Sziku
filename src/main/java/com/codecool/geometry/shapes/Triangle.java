package com.codecool.geometry.shapes;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;
    private double area;
    private double parimeter;
    private String parimeterFormula = "a+b+c";
    private String areaFormula = "sqrt(s×(s-a)×(s-b)×(s-c))";


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a) {
        this.a=a;
        this.b=a;
        this.c=a;
    }

    @Override
    public double calculateArea() {
        double s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        parimeter = a + b + c;
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
        return "Triangle, " +
                "a = " + a +
                ", b= " + b +
                ", c= " + c;
    }
}
