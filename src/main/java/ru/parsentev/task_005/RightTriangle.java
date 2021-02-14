package ru.parsentev.task_005;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Optional;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class RightTriangle extends Triangle {
    private static final Logger log = getLogger(RightTriangle.class);
    public static final int ROUND_SCALE = 5;

    public RightTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        boolean exists = super.exists();
        if (exists) {
            Double[] array = {first.distanceTo(second),
                    first.distanceTo(third),
                    second.distanceTo(third)};
            Arrays.sort(array);
            double hypotenuse = array[2];
            double leg1 = array[1];
            double leg2 = array[0];

            // Pythagorean theorem
            BigDecimal leftPart = BigDecimal.valueOf(hypotenuse * hypotenuse).setScale(ROUND_SCALE, RoundingMode.HALF_EVEN);
            BigDecimal rightPart = BigDecimal.valueOf(Math.pow(leg1, 2) + Math.pow(leg2, 2)).setScale(ROUND_SCALE, RoundingMode.HALF_EVEN);
            return leftPart.equals(rightPart);
        }

        return false;
    }
}
