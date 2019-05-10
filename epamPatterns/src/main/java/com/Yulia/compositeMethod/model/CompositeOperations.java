package com.Yulia.compositeMethod.model;

import java.util.ArrayList;
import java.util.List;

public class CompositeOperations {

    private double num1;
    private double num2;
    private double num3;
    private double num4;
    private double num5;
    private double num6;
/*

    private List<MathOperation> template = new ArrayList<MathOperation>();

    {
        template.add(new SumOperation());
        template.add(new MultipleOperation());
    }*/

    public CompositeOperations(double num1, double num2, double num3, double num4, double num5, double num6) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
    }


    public double getResult(){

       /* double res1 = template.get(0).doMathOperation(num1,num2);
        double res2 = template.get(0).doMathOperation(num3,num6);
        res1 = template.get(1).doMathOperation(res1, num4);
        res2 = template.get(1).doMathOperation(num5, res2);
        return template.get(0).doMathOperation(res1,res2);*/

       AddingComposite composite = new AddingComposite(
               new MultiplyingComposite(num4, new SumOperation(num1,num2)),
               new MultiplyingComposite(num5, new SumOperation(num3,num6)));
       return composite.doMathOperation();

    }



}
