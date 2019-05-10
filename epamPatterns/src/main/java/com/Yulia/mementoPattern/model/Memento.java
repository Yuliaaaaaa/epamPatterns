package com.Yulia.mementoPattern.model;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private List<Byte[][]> boards = new ArrayList<Byte[][]>();


    public void addMemento(Byte[][] board){
        Byte[][] newBoard = new Byte[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                newBoard[i][j] = board[i][j];
            }
        }
        boards.add(newBoard);
    }
    public void delLast(){
        boards.remove(getLast());
    }

    public Byte[][] getLast(){
        if(boards.size()!=0)
            return boards.get(boards.size()-1);
        return null;
    }
}
