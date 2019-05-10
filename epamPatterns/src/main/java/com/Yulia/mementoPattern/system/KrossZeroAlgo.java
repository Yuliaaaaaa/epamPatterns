package com.Yulia.mementoPattern.system;

import com.Yulia.mementoPattern.model.KrossZeroBoard;

import java.util.InputMismatchException;

public class KrossZeroAlgo {
    private KrossZeroBoard krossZero = new KrossZeroBoard();


    public KrossZeroBoard getKrossZeroBoard() {
        return krossZero;
    }

    public void setKrossZeroBoard(KrossZeroBoard krossZero) {
        this.krossZero = krossZero;
    }

    public boolean existWinner(int i, int j){
            if(fullColumn(i)) return true;
            if(fullRow(j)) return true;
            if(i == j && fullDiagonal1()) return true;
            if(i == 2-j && fullDiagonal2()) return true;
            return false;
    }

    public boolean fullColumn(int i){
        try{
            if(krossZero.getBoard()[i][0] == krossZero.getBoard()[i][1] &&
                    krossZero.getBoard()[i][1] == krossZero.getBoard()[i][2])
                return true;
        }
        catch (NullPointerException e){
            return false;
        }
        return false;
    }

    public boolean fullRow(int i){
        try{
            if(krossZero.getBoard()[0][i] == krossZero.getBoard()[1][i] &&
                    krossZero.getBoard()[1][i] == krossZero.getBoard()[2][i])
                return true;
        }
        catch (NullPointerException e){
            return false;
        }
        return false;
    }

    public boolean fullDiagonal1(){
        try {
            if(krossZero.getBoard()[0][0] == krossZero.getBoard()[1][1] &&
                    krossZero.getBoard()[1][1] == krossZero.getBoard()[2][2])
                return true;
        }
        catch (NullPointerException e){
            return false;
        }
        return false;
    }

    public boolean fullDiagonal2(){
        try {
            if(krossZero.getBoard()[0][2] == krossZero.getBoard()[1][1] &&
                    krossZero.getBoard()[1][1] == krossZero.getBoard()[2][0])
                return true;
        }
        catch (NullPointerException e){
            return false;
        }
        return false;
    }

    public boolean addSymbolAndCheckWinner(byte symbol, int xPosition, int yPosition){
        try{
            krossZero.addSymbol(symbol, xPosition, yPosition);
            if(existWinner(xPosition, yPosition)){
                return true;
            }
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
            return false;
        }
            return false;
    }

    public void goBack(){
        krossZero.goBack();
    }


}
