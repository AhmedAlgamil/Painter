/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.awt.Color;
import java.util.ArrayList;
import mycoustompainter.myshapes.MyCustomShapes;

/**
 *
 * @author gemy
 */
public class EraserTool implements MyTools {

    ArrayList<MyCustomShapes> eraserStream;

    public EraserTool(ArrayList<MyCustomShapes> eraserStream) {
        this.eraserStream = eraserStream;
    }

    public EraserTool() {
        this.eraserStream = new ArrayList<>();
    }

    public ArrayList<MyCustomShapes> getEraserStream() {
        return eraserStream;
    }

    public void setEraserStream(ArrayList<MyCustomShapes> eraserStream) {
        this.eraserStream = eraserStream;
    }

    @Override
    public void usePaintTools() {
        
    }
    
    
    
    public void usePaintTools(int firstX,int firstY,int secondX,int secondY) {
        
    }

}
