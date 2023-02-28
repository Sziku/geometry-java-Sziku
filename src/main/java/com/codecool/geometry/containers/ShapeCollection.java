package com.codecool.geometry.containers;


import com.codecool.geometry.shapes.Shape;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollection {
    private  List<Shape> shapeList;

    public ShapeCollection() {
        shapeList= new ArrayList<>();
    }


    public  void addShape(Shape shape) {
        shapeList.add(shape);
    }

    public  void getShapesTable() {
        printTable(shapeListTo2DArray(shapeList));
    }
    private  void printTable(String[][] table){
        int[] maxCharacterWordIantheColumn = getMaxCharacterWordIantheColumn(table);
        nonWordLine(maxCharacterWordIantheColumn, "/", "\\");
        for (int i = 0; i < table.length; i++) {
            if (i > 0) {
                nonWordLine(maxCharacterWordIantheColumn, "|", "|");
            }
            System.out.format("|");
            for (int j = 0; j < table[i].length; j++) {
                for (int k = 0; k < maxCharacterWordIantheColumn[j]  - table[i][j].length(); k++) {
                    System.out.format(" ");
                }
                System.out.format(table[i][j]);
                System.out.format("|");
            }
            System.out.format("\n");
        }
        nonWordLine(maxCharacterWordIantheColumn, "\\", "/");
    }

    private  int[] getMaxCharacterWordIantheColumn(String[][] table) {
        int[] maxCharacterWordIantheColumn = new int[table[0].length];
        int maxCharacterWord = 0;
        for (int i = 0; i < table[0].length; i++) {
            for (String[] strings : table) {
                if (strings[i].length() > maxCharacterWord) {
                    maxCharacterWord = strings[i].length();
                }
            }
            maxCharacterWordIantheColumn[i] = maxCharacterWord + 2;
            maxCharacterWord = 0;
        }
        return maxCharacterWordIantheColumn;
    }

    private  void nonWordLine(int[] maxCharacterWordIantheColumn, String start, String end) {
        System.out.format(start);
        for (int i = 0; i < maxCharacterWordIantheColumn.length; i++) {
            for (int j = 0; j < maxCharacterWordIantheColumn[i]; j++) {
                System.out.format("-");
            }
            if (i == maxCharacterWordIantheColumn.length - 1) {
                System.out.format(end);
            } else {
                System.out.format("|");
            }
        }
        System.out.format("\n");
    }

    private  String[][] shapeListTo2DArray(List<Shape> shapeList) {
        String[] tableHead ={"ID", "Class", "toString", "Perimeter", "Formula","Area","Formula"};
        int shapeListSize = shapeList.size();
        String[][] table = new String[shapeListSize+1][tableHead.length];
        System.arraycopy(tableHead, 0, table[0], 0, tableHead.length);
        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 0; i < shapeListSize; i++) {
            table[i+1][0]=String.valueOf(i);
            table[i+1][1]=shapeList.get(i).getClass().getSimpleName();
            table[i+1][2]=shapeList.get(i).toString();
            table[i+1][3]=df.format(shapeList.get(i).calculatePerimeter());
            table[i+1][4]=shapeList.get(i).getPerimeterFormula();
            table[i+1][5]=df.format(shapeList.get(i).calculateArea());
            table[i+1][6]=shapeList.get(i).getAreaFormula();

        }
        return table;
    }

    public double getLargestShapeByPerimeter() {
        double max =0;
        double temp;
        for(Shape shape : shapeList){
            temp = Double.parseDouble(shape.getPerimeter());
            if(temp>max){
                max=temp;
            }
        }
        return max;
    }

    public double getLargestShapeByArea() {
        double max =0;
        double temp;
        for(Shape shape : shapeList){
            temp = Double.parseDouble(shape.getArea());
            if(temp>max){
                max=temp;
            }
        }
        return max;
    }

    public List<String> getLargestShapeListByAra(double max){
        List<String> largestAreaShapeList = new ArrayList<>();
        for(Shape shape : shapeList){
            if ((shape.calculateArea()==max)){
                largestAreaShapeList.add(shape.getClass().getSimpleName());
            }
        }
        return largestAreaShapeList;
    }

    public List<String> getLargestShapeListByPerimeter(double max){
        List<String> largestPerimeterShapeList = new ArrayList<>();
        for(Shape shape : shapeList){
            if ((shape.calculatePerimeter()==max)){
                largestPerimeterShapeList.add(shape.getClass().getSimpleName());
            }
        }
        return largestPerimeterShapeList;
    }
}

