package com.Yulia.strategy;

public class Harpia extends CharacterStrategy {
    protected Harpia() {
        super(false, true, false);
    }
    public void characterInfo() {
        System.out.println("I am harpia!");
    }
}
