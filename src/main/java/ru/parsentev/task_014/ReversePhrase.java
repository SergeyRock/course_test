package ru.parsentev.task_014;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ReversePhrase {
    private static final Logger log = getLogger(ReversePhrase.class);
    private final String line;

    public ReversePhrase(final String line) {
        this.line = line;
    }

    public String reverse() {
        String[] words = line.split(" ");
        String[] reversedWords = new String[words.length];

        for (int i = 0, j = words.length - 1; i < words.length; i++, j--) {
            reversedWords[j] = words[i];
        }

        return String.join(" ", reversedWords);
    }
}
