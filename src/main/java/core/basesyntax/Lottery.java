package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),
                    new Random().nextInt(MAX));
    }
}
