package com.Yulia.chainResponsibility;

public class BuildingChains {

    public static boolean normalPayment(boolean goodFixing, boolean goodControlling,
                                 boolean normalGettingPercent,  boolean otherThingsOK){
        Check check = new FixingCheck(
                new ControllingCheck(
                        new GetPercentCheck(
                                new OtherThingsCheck(null, otherThingsOK
                                ),normalGettingPercent
                        ), goodControlling
                ), goodFixing
        );
        boolean bool = check.checking();
        return bool;
    }

    public static boolean privilegyPayment(boolean goodFixing, boolean hasPrivilegies, boolean goodControlling,
                                    boolean normalGettingPercent,  boolean otherThingsOK){
        Check check = new FixingCheck(
                new PrivilegesCheck(
                        new ControllingCheck(
                                new GetPercentCheck(
                                        new OtherThingsCheck(null, otherThingsOK
                                        ),normalGettingPercent
                                ), goodControlling
                        ), hasPrivilegies
                ), goodFixing
        );
        boolean bool = check.checking();
        return bool;
    }


    public static boolean countryPayment(boolean goodFixing, boolean hasCountryAcception, boolean goodControlling,
                                  boolean normalGettingPercent,  boolean otherThingsOK){
        Check check = new FixingCheck(
                new CountryBankingCheck(
                        new ControllingCheck(
                                new GetPercentCheck(
                                        new OtherThingsCheck(null, otherThingsOK
                                        ),normalGettingPercent
                                ), goodControlling
                        ), hasCountryAcception
                ), goodFixing
        );
        boolean bool = check.checking();
        return bool;
    }

    public static boolean insideBankPayment(boolean goodFixing, boolean insideBankCheckingOK, boolean goodControlling,
                                     boolean normalGettingPercent,  boolean otherThingsOK){
        Check check = new FixingCheck(
                new InsideBankCheck(
                        new ControllingCheck(
                                new GetPercentCheck(
                                        new OtherThingsCheck(null, otherThingsOK
                                        ),normalGettingPercent
                                ), goodControlling
                        ), insideBankCheckingOK
                ), goodFixing
        );
        boolean bool = check.checking();
        return bool;
    }
}
