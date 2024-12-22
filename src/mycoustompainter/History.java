/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycoustompainter;

import mycoustompainter.myshapes.MyCustomShapes;

/**
 *
 * @author gemy
 */
public class History {

    private int historyId = 0;

    private String historyName;

    public History(int historyId, String historyName) {
        this.historyId = historyId;
        this.historyName = historyName;
    }

    public void setHistoryd(int historyd) {
        this.historyId = historyd;
    }

    public void setHistoryName(String historyName) {
        this.historyName = historyName;
    }

    public int getHistoryd() {
        return historyId;
    }

    public String getHistoryName() {
        return historyName;
    }

}
