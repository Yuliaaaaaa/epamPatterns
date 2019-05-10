package com.Yulia.chainResponsibility;

public class OtherThingsCheck extends Check {

    private boolean otherThingsOK;

    public OtherThingsCheck(Check next, boolean otherThingsOK) {
        super(next);
        this.otherThingsOK = otherThingsOK;
    }

    OtherThingsCheck(Check next) {
        super(next);
    }

    boolean checking(){
        if(otherThingsOK){

            System.out.println("Other things check ok!");

            if(next!=null) return doNext();
            return true;
        }
        System.out.println("I stacked in other things check!");
        return false;
    }
}
