package org.freesoft.systemutils;

import java.awt.*;
import java.util.Random;

public class KeepSystemActive {
    public static final Long twoMinsInMillis = 2 * 60 * 1000L;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        Random random = new Random();
        while (true) {
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(twoMinsInMillis);
        }
    }

}
