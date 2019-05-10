package com.Yulia.chainResponsibility;

public class InsideBankCheck extends Check {

    private boolean insideBankCheckingOK;

    public InsideBankCheck(Check next, boolean insideBankCheckingOK) {
        super(next);
        this.insideBankCheckingOK = insideBankCheckingOK;
    }

    InsideBankCheck(Check next) {
        super(next);
    }

    boolean checking() {
        if(insideBankCheckingOK){
            System.out.println("Inside bank check ok!");

            if(next!=null) return doNext();
            return true;
        }
        System.out.println("I stacked in inside bank check!");
        return false;
    }
}
