package com.codecool.geometry;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.*;
import com.codecool.geometry.utilities.FormulaProvider;
import com.codecool.geometry.utilities.Util;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Util util = new Util();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        ShapeCollection shapeCollection = new ShapeCollection();
        double[] shapeParameters = new double[3];
        String[] mainMenu = {"Add new shape","Show all shape","Show shape with the largest perimeter","Show shape with the largest area","Show formulas","Exit"};
        String[] shapeList = {"Circle","Equilateral Triangle","Triangle","Square","Regular Pentagon","Rectangle","Back to Main menu"};

	    while (isRunning) {
           util.printMsg("Choose option:");

            util.printMenu(mainMenu);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    while (isRunning){
                        util.printMsg("Choose shape:");
                        util.printMenu(shapeList);
                        int shapeType = scanner.nextInt();
                        switch (shapeType){
                            case 0 -> isRunning = false;
                            case 1 -> {
                                util.printMsg("Set circle radius:");
                                shapeParameters[0]=scanner.nextDouble();
                                if(Shape.checkIfArgsGreaterThanZero(shapeParameters)){
                                    throw new IllegalArgumentException();
                                }else {
                                    shapeCollection.addShape(new Circle(shapeParameters[0]));
                                }

                            }
                            case 2 -> {
                                util.printMsg("Set Equilateral triangle sides size:");
                                shapeParameters[0]=scanner.nextDouble();
                                if(Shape.checkIfArgsGreaterThanZero(shapeParameters)){
                                    throw new IllegalArgumentException();
                                }else {shapeCollection.addShape(new EquilateralTriangle(shapeParameters[0]));}

                            }
                            case 3 -> {
                                util.printMsg("Set triangle sides size:");
                                util.printMsg("A side:");
                                shapeParameters[0]=scanner.nextDouble();
                                util.printMsg("B side:");
                                shapeParameters[1]=scanner.nextDouble();
                                util.printMsg("C side:");
                                shapeParameters[2]=scanner.nextDouble();
                                if(Shape.checkIfArgsGreaterThanZero(shapeParameters)){
                                    throw new IllegalArgumentException();
                                }else {shapeCollection.addShape(new Triangle(shapeParameters[0],shapeParameters[1],shapeParameters[2]));}

                            }
                            case 4 -> {
                                util.printMsg("Set Square side size:");
                                shapeParameters[0]=scanner.nextDouble();
                                if(Shape.checkIfArgsGreaterThanZero(shapeParameters)){
                                    throw new IllegalArgumentException();
                                }else {shapeCollection.addShape(new Square(shapeParameters[0]));}

                            }
                            case 5 -> {
                                util.printMsg("Set Regular pentagon side size:");
                                shapeParameters[0]=scanner.nextDouble();
                                if(Shape.checkIfArgsGreaterThanZero(shapeParameters)){
                                    throw new IllegalArgumentException();
                                }else {shapeCollection.addShape(new RegularPentagon(shapeParameters[0]));}

                            }
                            case 6 -> {
                                util.printMsg("Set Rectangle sides size:");
                                util.printMsg("A side:");
                                shapeParameters[0]=scanner.nextDouble();
                                util.printMsg("B side:");
                                shapeParameters[1]=scanner.nextDouble();
                                if(Shape.checkIfArgsGreaterThanZero(shapeParameters)){
                                    throw new IllegalArgumentException();
                                }else {shapeCollection.addShape(new Rectangle(shapeParameters[0], shapeParameters[1]));}

                            }
                        }
                    }
                    isRunning = true;
                    break;
                case 2:
                    shapeCollection.getShapesTable();
                    break;
                case 3:
                    util.printMsg("Largest perimeter shape(s): ");
                    double maxPeri =shapeCollection.getLargestShapeByPerimeter();
                    util.printMsg(shapeCollection.getLargestShapeListByPerimeter(maxPeri).toString()+" perimeter: "+maxPeri);
                    break;
                case 4:
                    util.printMsg("Largest area shape(s): ");
                    double maxArea = shapeCollection.getLargestShapeByArea();
                    util.printMsg(shapeCollection.getLargestShapeListByAra(maxArea).toString()+" area: "+maxArea);
                    break;
                case 5:
                    while (isRunning){
                        util.printMsg("Choose shape:");
                        util.printMenu(shapeList);
                        int userInput = scanner.nextInt()-1;
                        if(userInput==-1){
                            isRunning=false;
                        }else {
                            util.printMsg(shapeList[userInput]+" area formula: "+ FormulaProvider.getAreaForShape(userInput)+", "+shapeList[userInput]+" perimeter formula: "+ FormulaProvider.getPerimeterForShape(userInput));

                        }
                    }
                   isRunning=true;
                    break;
                case 0:
                    isRunning = false;
                    break;
            }
        }
    }



}
