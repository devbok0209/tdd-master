package output;

import com.forest.Forest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.security.SecureRandom;

public class DemoOutput {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;

    static Logger logger = LoggerFactory.getLogger(DemoOutput.class);

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < (TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(CANVAS_SIZE), random(CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(CANVAS_SIZE), random(CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        logger.info("{} trees drawn", TREES_TO_DRAW);
        logger.info("---------------------");
        logger.info("Memory usage:");
        logger.info("Tree size (8 bytes) * {}", TREES_TO_DRAW);
        logger.info("+ TreeTypes size (~30 bytes) * {}", TREE_TYPES);
        logger.info("---------------------");
        logger.info("Total: {} MB", ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024));
    }

    private static int random(int max) {
        SecureRandom secureRandom = new SecureRandom();
        return (secureRandom.nextInt() * ((max) + 1));
    }
}
