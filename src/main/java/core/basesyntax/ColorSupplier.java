package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
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
        int choice = new Random().nextInt(Colors.values().length);
        return Colors.values()[choice].toString().toLowerCase();
    }
}
