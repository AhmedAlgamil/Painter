/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycoustompainter.myshapes;

import java.awt.Color;

/**
 *
 * @author gemy
 */
//import java.util.
public class MyCustomShapes {

    private String name;

    private int x1;

    private int y1;

    private int x2;

    private int y2;

    private int width;

    private int height;
    
    private Color shapeColor;
    private int shapeId = 0;

   
    public MyCustomShapes(String name, int x1, int y1, int x2, int y2) {
        this.name = name;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
     public MyCustomShapes(String name, int x1, int y1, int x2, int y2,int shapeId) {
        this.name = name;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.shapeId = shapeId;
    }

    public MyCustomShapes() {
        this.name = "";
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        this.shapeId = 0;
    }

    public MyCustomShapes(String shapeName) {
        this.name = shapeName;
    }

    public void setShapeId(int shapeId) {
        this.shapeId = shapeId;
    }

    public int getShapeId() {
        return shapeId;
    }
    
     public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }


    public int calculateWidth() {
        this.width = x2 - x1;
        return this.width;
    }

    public int calculateHeight() {

        return y2 - y1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
