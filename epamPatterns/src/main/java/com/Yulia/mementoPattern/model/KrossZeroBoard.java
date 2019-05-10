package com.Yulia.mementoPattern.model;

import java.util.InputMismatchException;

public class KrossZeroBoard {

    private Byte[][] board = new Byte[3][3];   // 1 for x, 2 for zero
    private Memento mementos = new Memento();



    public Byte[][] getBoard() {
        return board;
    }

    public void setBoard(Byte[][] board) {
        this.board = board;
    }


    public Memento getMementos() {
        return mementos;
    }

    public void setMementos(Memento mementos) {
        this.mementos = mementos;
    }

    public void addSymbol(byte symbol, int xPosition, int yPosition){
        if(board[xPosition][yPosition] != null){
            throw new InputMismatchException("Field is occupied");
        }
        else {
            mementos.addMemento(board);
            board[xPosition][yPosition] = symbol;
        }
    }

    public void goBack(){
        if(mementos.getLast()!=null)
            this.board = mementos.getLast();
        else
            this.board = new Byte[3][3];

        mementos.delLast();
    }
}
