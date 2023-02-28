package com.codecool.geometry.shapes;

public class EquilateralTriangle extends Triangle {
    private double a;
    private String parimeterFormula = "3×a";
    private String areaFormula = "a×a×sqrt(3)/4";

    public EquilateralTriangle(double a) {
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
        return "Equilateral Triangle, " +
                "a = " + a;
    }
}
