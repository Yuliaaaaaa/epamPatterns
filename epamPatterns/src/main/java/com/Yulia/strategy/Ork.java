package com.Yulia.strategy;

public class Ork extends CharacterStrategy {
    protected Ork() {
        super(true, false, false);
    }
    public void characterInfo() {
        System.out.println("I am ork!");
    }
}
