package com.Yulia.factoryMethod.model;

public class FigureBlock {
    private int x;
    private int y;

    public FigureBlock(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        String string = "";
        for(int i = 0; i < x; i++){
            string+="_";
        }
        string+="[]";
        return string;
    }
}
