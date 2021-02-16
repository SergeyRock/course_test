package ru.parsentev.task_011;

import org.slf4j.Logger;

import java.util.Arrays;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ArrayContainsOne {
    private static final Logger log = getLogger(ArrayContainsOne.class);
    private final int[] values;

    public ArrayContainsOne(final int[] values) {
        this.values = values;
    }

    public boolean containsOnlyOne() {
        if (values.length == 0) {
            return false;
        }
        long mult = 1;

        for (int i = 0; i < values.length; i++) {
            mult *= values[i];
        }


        return mult == 1;
    }
}
