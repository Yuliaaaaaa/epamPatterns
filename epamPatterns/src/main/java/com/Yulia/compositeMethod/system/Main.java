package com.Yulia.compositeMethod.system;

import com.Yulia.compositeMethod.model.CompositeOperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("Calculator for (1+2)*4+5*(3+6)\n\n");
        System.out.println("Insert your data divided by space.\n\n");
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        String[] numbrs = nums.split(" ");
        if(numbrs.length != 6){
            System.out.println("Please, insert 6 number divided by space!\n");
            menu();
            return;
        }
        double[] numsArray = new double[6];
        try{
            for(int i = 0; i < 6; i++){
                numsArray[i] = Double.parseDouble(numbrs[i]);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Not a number!\n\n");
            menu();
        }

        CompositeOperations operations = new CompositeOperations
                (numsArray[0], numsArray[1], numsArray[2], numsArray[3], numsArray[4], numsArray[5]);
        System.out.println("Result is:\t" + operations.getResult());
    }
}
