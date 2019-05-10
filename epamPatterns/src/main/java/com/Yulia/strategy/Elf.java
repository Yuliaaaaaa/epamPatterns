package com.Yulia.strategy;

public class Elf extends CharacterStrategy {
    protected Elf() {
        super(true, false, false);
    }

    public void characterInfo() {
        System.out.println("I am elf!");
    }
}
