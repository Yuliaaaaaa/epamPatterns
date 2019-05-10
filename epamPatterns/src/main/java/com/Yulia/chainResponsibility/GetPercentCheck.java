package com.Yulia.chainResponsibility;

public class GetPercentCheck extends Check {

    private boolean normalGettingPercent;


    public GetPercentCheck(Check next, boolean normalGettingPercent) {
        super(next);
        this.normalGettingPercent = normalGettingPercent;
    }


    GetPercentCheck(Check next) {
        super(next);
    }

    boolean checking() {
        if(normalGettingPercent){
            System.out.println("Getting percent check ok!");

            if(next!=null) return doNext();
            return true;
        }
        System.out.println("I stacked in getting percent check!");
        return false;
    }
}
