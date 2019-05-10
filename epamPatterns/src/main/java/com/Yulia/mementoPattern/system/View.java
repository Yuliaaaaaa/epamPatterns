package com.Yulia.mementoPattern.system;

import com.Yulia.mementoPattern.model.KrossZeroBoard;

public class View {
    KrossZeroBoard krossZero;

    public View(KrossZeroBoard krossZero) {
        this.krossZero = krossZero;
    }

    public char[][] transformBoard(){
        char[][] board = new char[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(krossZero.getBoard()[i][j] == null){
                    board[i][j] = ' ';
                    continue;
                }
                if(krossZero.getBoard()[i][j] == 0) {
                    board[i][j] = '0';
                    continue;
                }
                if(krossZero.getBoard()[i][j] == 1){
                    board[i][j] = 'x';
                    continue;
                }

            }
        }
        return board;
    }

    public void printBoard(){
        char[][] board = transformBoard();
        for(int i = 0; i < 3; i++){
            System.out.print("|\t");
            for (int j = 0; j < 3; j++){
                System.out.print(board[i][j] + "\t|\t");
            }
            System.out.println();
        }
    }
}
