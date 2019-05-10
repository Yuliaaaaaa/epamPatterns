package com.Yulia.chainResponsibility;

public class FixingCheck extends Check {
    private boolean goodFixing;

    public FixingCheck(Check next, boolean goodFixing) {
        super(next);
        this.goodFixing = goodFixing;
    }

    FixingCheck(Check next) {
        super(next);
    }

    boolean checking() {
        if(goodFixing){
            System.out.println("Fixing check ok!");
            if(next!=null) return doNext();
            return true;
        }
        System.out.println("I stacked in fixing check!");
        return false;
    }
}
