package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList shapesList = new ArrayList<Shape>();

    public ArrayList getShapesList() {
        return shapesList;
    }

    public ShapeCollector(ArrayList shapesList) {
        this.shapesList = shapesList;
    }

    public void addFigure(Shape shape){
        shapesList.add(shape);
    }

    public boolean removeFigure(int n){
        if(n<shapesList.size()){
            shapesList.remove(n);
            return true;
        } else return false;
    }

    public Shape getFigure(int n){
        if(n<shapesList.size()){
            Shape shape = (Shape) shapesList.get(n);
            return shape;
        } else return null;
    }

    public ArrayList<Shape> showFigures(){
        return shapesList;
    }
}
