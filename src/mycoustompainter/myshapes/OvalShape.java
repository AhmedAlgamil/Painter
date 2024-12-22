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
public class OvalShape extends MyCustomShapes {

    public OvalShape(String name, int x1, int y1, int x2, int y2) {
        super(name, x1, y1, x2, y2);
    }

    public OvalShape() {
        int[][] arr = new int[3][];
    }

    public OvalShape(String shapeName) {
        super(shapeName);
    }
    
    @Override
    public int getShapeId() {
        return super.getShapeId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setShapeId(int shapeId) {
        super.setShapeId(shapeId); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public void setWidth(int width) {
        super.setWidth(width); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getWidth() {
        return super.getWidth(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setY2(int y2) {
        super.setY2(y2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getY2() {
        return super.getY2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setX2(int x2) {
        super.setX2(x2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getX2() {
        return super.getX2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setY1(int y1) {
        super.setY1(y1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getY1() {
        return super.getY1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setX1(int x1) {
        super.setX1(x1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getX1() {
        return super.getX1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calculateHeight() {
        return super.calculateHeight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calculateWidth() {
        return super.calculateWidth(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setShapeColor(Color shapeColor) {
        super.setShapeColor(shapeColor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getShapeColor() {
        return super.getShapeColor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHeight() {
        return super.getHeight(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
