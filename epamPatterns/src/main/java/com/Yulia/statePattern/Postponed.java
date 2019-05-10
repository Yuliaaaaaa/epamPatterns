package com.Yulia.statePattern;

import java.util.Scanner;

public class Postponed implements DocumentState {
    public void printInfo() {

    }

    public DocumentState changeState() {
        System.out.println("Insert state to change:");
        Scanner scanner = new Scanner(System.in);
        String state = scanner.nextLine();
        switch (StateTransform.transforming(state)){
            case POSTPONED:{
                System.out.println("Already here!\n");
                return this;
            }
            case CONSIDERING:{
                return new Considering();
            }
            default:{
                System.out.println("Unable!\n");
                return this;
            }
        }
    }
}
