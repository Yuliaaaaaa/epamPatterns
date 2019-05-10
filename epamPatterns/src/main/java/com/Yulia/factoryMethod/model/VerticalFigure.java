package com.Yulia.factoryMethod.model;

public class VerticalFigure extends TetrisFigureFactory {
    private final FigureBlock build1 = new FigureBlock(0,0);
    private final FigureBlock build2 = new FigureBlock(0,1);
    private final FigureBlock build3 = new FigureBlock(0,2);
    private final FigureBlock build4 = new FigureBlock(0,3);

    public void build() {
        super.build();
        buildingParts();
        System.out.println("[]");
        System.out.println("[]");
        System.out.println("[]");
        System.out.println("[]");
    }
}
