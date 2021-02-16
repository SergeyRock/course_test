package ru.parsentev.task_008;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Primes {
    private static final Logger log = getLogger(Primes.class);

    private final int limit;

    public Primes(final int limit) {
        this.limit = limit;
    }

    public List<Integer> calc() {
        List<Integer> primes = new ArrayList<>();

        for (int i = 1; i <= limit; i++) {
            int divCount = 0;
            boolean isPrime = true;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divCount++;
                    if (divCount > 2) {
                        break;
                    }
                }
            }

            isPrime = divCount == 2;

            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }
}
