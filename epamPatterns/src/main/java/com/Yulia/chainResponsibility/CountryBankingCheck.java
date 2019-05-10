package com.Yulia.chainResponsibility;

public class CountryBankingCheck extends Check {

    private boolean hasAcception;

    public CountryBankingCheck(Check next, boolean hasAcception) {
        super(next);
        this.hasAcception = hasAcception;
    }

    CountryBankingCheck(Check next) {
        super(next);
    }

    boolean checking() {
        if(hasAcception){
            System.out.println("Country banking check ok!");
            if(next!=null) return doNext();
            return true;
        }
        System.out.println("I stacked in country banking check!");
        return false;
    }
}
