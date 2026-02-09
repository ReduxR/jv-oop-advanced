package core.basesyntax;

import core.basesyntax.model.Figure;

public class Main {
    // private static final Random random = new Random();
    private static final FigureSupplier figSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figureArray = new Figure[6];

        for (int i = 0; i < figureArray.length; i++) {
            if (i < (figureArray.length) / 2) {
                figureArray[i] = figSupplier.getRandomFigure();
                figureArray[i].draw();
            } else {
                figureArray[i] = figSupplier.getDefaultFigure();
                figureArray[i].draw();
            }
        }
    }
}
