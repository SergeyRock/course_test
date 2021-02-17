package ru.parsentev.task_015;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class CycleShift {
    private static final Logger log = getLogger(CycleShift.class);

    public int[] getValues() {
        return values;
    }

    private final int[] values;

    public CycleShift(final int[] values) {
        this.values = values;
    }

    public int[] shift(int position) {
        if (position == 0) {
            return values;
        }

        if (values.length == 0) {
            return values;
        }

        if (Math.abs(position) >= values.length) {
            position %= values.length;
        }

        for (int i = 1; i <= Math.abs(position); i++) {
            if (position > 0) {
                manualMoveToOnePositivePosition();
            } else {
                manualMoveToOneNegativePosition();
            }
        }

        return values;
    }

    public void manualMoveToOnePositivePosition() {
        if (values.length <= 1) {
            return;
        }

        int lastElement = values[values.length - 1];
        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = lastElement;
    }

    public void manualMoveToOneNegativePosition() {
        if (values.length <= 1) {
            return;
        }

        int firstElement = values[0];
        for (int i = 0; i < values.length - 1; i++) {
            values[i] = values[i + 1];
        }
        values[values.length - 1] = firstElement;
    }
}
