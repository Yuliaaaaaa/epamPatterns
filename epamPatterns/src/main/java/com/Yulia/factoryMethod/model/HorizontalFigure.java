package com.Yulia.factoryMethod.model;

public class HorizontalFigure extends TetrisFigureFactory {
    private final FigureBlock build1 = new FigureBlock(0,0);
    private final FigureBlock build2 = new FigureBlock(1,0);
    private final FigureBlock build3 = new FigureBlock(2,0);
    private final FigureBlock build4 = new FigureBlock(3,0);

    public void build() {
        super.build();
        buildingParts();
        System.out.println("[][][][]");
    }
}
