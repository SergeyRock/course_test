package ru.parsentev.task_009;

import java.util.*;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class UniqueChars {
    private final String line;

    public UniqueChars(final String line) {
        this.line = line;
    }

    public int unique() {
        String[] chars = line.split("");
        Set<String> set = new HashSet<>(Arrays.asList(chars));
        return set.size();
    }
}
