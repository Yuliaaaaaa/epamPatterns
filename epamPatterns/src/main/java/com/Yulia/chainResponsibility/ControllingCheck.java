package com.Yulia.chainResponsibility;

public class ControllingCheck extends Check {
    private boolean goodControlling;

    public ControllingCheck(Check next, boolean goodControlling) {
        super(next);
        this.goodControlling = goodControlling;
    }

    ControllingCheck(Check next) {
        super(next);
    }

    boolean checking() {
        if(goodControlling){
            System.out.println("Controlling check ok!");
            if(next!=null) return doNext();
            return true;
        }
        System.out.println("I stacked in controlling check!");
        return false;
    }
}
