package com.Yulia.chainResponsibility;

public abstract class Check {
    protected Check next;

    Check(Check next){
        this.next = next;
    }

    abstract boolean checking();

    boolean doNext(){
        return next.checking();
    }
}
