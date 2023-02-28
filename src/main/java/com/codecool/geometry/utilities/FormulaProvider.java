package com.codecool.geometry.utilities;


import com.codecool.geometry.shapes.*;

public class FormulaProvider {

    public static String getAreaForShape(int userInput) {
        switch (userInput) {
            case 0 -> {
                return new Circle(1).getAreaFormula();
            }

            case 1 -> {
                return new EquilateralTriangle(1).getAreaFormula();
            }
            case 2 -> {
                return new Triangle(1, 1, 1).getAreaFormula();
            }

            case 3 -> {
                return new Square(1).getAreaFormula();
            }
            case 4 -> {
                return new RegularPentagon(1).getAreaFormula();
            }
            case 5 -> {
                return new Rectangle(1, 1).getAreaFormula();
            }
        }
        return null;
    }

    public static String getPerimeterForShape(int userInput) {
        switch (userInput) {
            case 0 -> {
                return new Circle(1).getPerimeterFormula();
            }

            case 1 -> {
                return new EquilateralTriangle(1).getPerimeterFormula();
            }
            case 2 -> {
                return new Triangle(1, 1, 1).getPerimeterFormula();
            }

            case 3 -> {
                return new Square(1).getPerimeterFormula();
            }
            case 4 -> {
                return new RegularPentagon(1).getPerimeterFormula();
            }
            case 5 -> {
                return new Rectangle(1, 1).getPerimeterFormula();
            }
        }
        return null;
    }
}
