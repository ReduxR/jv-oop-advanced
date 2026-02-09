package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier supplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(5);

        switch (randomFigure) {
            case 0:
                return new Circle(supplier.getRandomColor(),
                        random.nextDouble(11.0));
            case 1:
                return new Square(supplier.getRandomColor(),
                        random.nextDouble(11.0));
            case 2:
                return new Rectangle(supplier.getRandomColor(),
                        random.nextDouble(11.0),
                        random.nextDouble(11.0));
            case 3:
                return new IsoscelesTrapezoid(supplier.getRandomColor(),
                        random.nextDouble(11.0),
                        random.nextDouble(11.0),
                        random.nextDouble(11.0));
            case 4:
                return new RightTriangle(supplier.getRandomColor(),
                        random.nextDouble(11.0),
                        random.nextDouble(11.0));
            default:
                return getDefaultFigure();
        }
    }
}
