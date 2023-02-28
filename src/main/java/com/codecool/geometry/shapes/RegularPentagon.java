package com.codecool.geometry.shapes;

public class RegularPentagon extends Shape {

    private double a;
    private double area;
    private double parimeter;
    private String parimeterFormula = "5×a";
    private String areaFormula = "a×a×sqrt(5×(5+2×sqrt(5))/4";


    public RegularPentagon(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        area = a*a*Math.sqrt(5*(5+2*Math.sqrt(5)))/4;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        parimeter = a*5;
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
        return "Pentagon, " +
                "a = " + a ;
    }
}
