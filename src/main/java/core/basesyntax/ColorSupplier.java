package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    private enum Colors {
        WHITE,
        BLACK,
        RED,
        GREEN,
        BLUE,
        YELLOW,
        CYAN,
    }

    public String getRandomColor() {
        int choice = random.nextInt(Colors.values().length);
        return Colors.values()[choice].name().toLowerCase();
    }
}
