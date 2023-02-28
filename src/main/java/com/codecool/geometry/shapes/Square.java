package com.codecool.geometry.shapes;

public class Square extends Rectangle {
    private double a;
    private String parimeterFormula = "4×a";
    private String areaFormula = "a×a";

    public Square(double a) {
        super(a);
        this.a=a;
    }

    @Override
    public String getPerimeterFormula() {
        return parimeterFormula;
    }

    @Override
    public String getAreaFormula() {
        return areaFormula;
    }
    @Override
    public String toString() {
        return "Square, " +
                "a = " + a;
    }
}
