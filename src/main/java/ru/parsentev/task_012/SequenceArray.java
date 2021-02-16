package ru.parsentev.task_012;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class SequenceArray {
    private static final Logger log = getLogger(SequenceArray.class);
    public static final int MIN_ONE_COUNT_IN_SEQUENCE = 3;

    private final int[] values;

    public SequenceArray(final int[] values) {
        this.values = values;
    }

    public boolean containsOneSequence() {
        long oneCount = 0;

        for (int i = 0; i < values.length - 1; i++) {
            int currentValue = values[i];

            if (currentValue == 0) {
                oneCount = 0;
                continue;
            }

            int nextValue = values[i + 1];

            if (currentValue == nextValue) {
                oneCount++;
            } else {
                oneCount = 0;
                continue;
            }

            if (oneCount + 1 == MIN_ONE_COUNT_IN_SEQUENCE) {
                return true;
            }
        }

        return false;
    }
}
