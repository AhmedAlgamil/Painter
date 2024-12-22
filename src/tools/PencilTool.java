/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.awt.Color;
import java.util.ArrayList;
import mycoustompainter.History;
import mycoustompainter.myshapes.MyCustomShapes;

/**
 *
 * @author gemy
 */
public class PencilTool implements MyTools {
    
    private ArrayList<MyCustomShapes> streamShape;
    private History myHistory;

    public PencilTool(History history,ArrayList<MyCustomShapes> streamShape) {
        this.streamShape = streamShape;
        this.myHistory = history;
    }
    
    
    
    @Override
    public void usePaintTools() {
        
    }
    
    
}
