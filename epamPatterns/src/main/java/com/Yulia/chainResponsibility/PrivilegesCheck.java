package com.Yulia.chainResponsibility;

public class PrivilegesCheck extends Check {

    private boolean hasPrivileges;

    public PrivilegesCheck(Check next, boolean hasPrivileges) {
        super(next);
        this.hasPrivileges = hasPrivileges;
    }

    PrivilegesCheck(Check next) {
        super(next);
    }

    boolean checking(){

        if(hasPrivileges){

            System.out.println("Privileges check ok!");

            if(next!=null) return doNext();
            return true;
        }
        System.out.println("I stacked in privileges check!");
        return false;
    }
}
