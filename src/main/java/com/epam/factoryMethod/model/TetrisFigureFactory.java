package com.epam.factoryMethod.model;

public class TetrisFigureFactory {
    protected FigureBlock block1;
    protected FigureBlock block2;
    protected FigureBlock block3;
    protected FigureBlock block4;

    public void build(){
        System.out.println("\nBuilding figure...\n");
    }

    public static TetrisFigureFactory getFigure(Figures figure){
        switch(figure){
            case HORIZONTAL:{
                return new HorizontalFigure();
            }
            case VERTICAL:{
                return new VerticalFigure();
            }
            case SQUARE:{
                return new SquareFigure();
            }
            case S_SHAPE:{
                return new S_ShapeFigure();
            }
            case SUPERVERTICAL:{
                return new SuperVerticalFigure();
            }
            case SUPERHORIZONTAL:{
                return new SuperHorizontalFigure();
            }
            default:{
                return null;
            }
        }
    }



}
