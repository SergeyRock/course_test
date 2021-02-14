package ru.parsentev.task_007;

import org.slf4j.Logger;

import java.util.Arrays;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Expression {
    private static final Logger log = getLogger(Expression.class);
    public static final String OPERATION_ADD = "\\+";
    public static final String OPERATION_SUB = "-";
    public static final String OPERATION_MULTIPLY = "\\*";
    public static final String OPERATION_DIV = "/";
    public static final String[] OPERATIONS = {OPERATION_ADD, OPERATION_SUB, OPERATION_MULTIPLY, OPERATION_DIV};

    private final String expr;

    public Expression(final String expr) {
        this.expr = expr.trim();
    }

    public double calc() {
        log.info("Expression: {}", expr);

        double accum = 0.0;
        try {
            if (checkExpression()) {
                for (String operation : OPERATIONS) {
                    accum = getAccum(OPERATION_ADD);
                    log.info("Expression result: {}", accum);
                    return accum;
                }
            }
        } catch (Exception e){

        }
        throw new java.lang.IllegalStateException("Incorrect expression: " + expr);
    }

    private boolean checkExpression() {
        if (expr.isEmpty()) {
            return false;
        }

        Double aDouble;
        try {
            char lastChar = expr.charAt(expr.length() - 1);
            aDouble = Double.valueOf(String.valueOf(lastChar));

            char firstChar = expr.charAt(0);
            aDouble = Double.valueOf(String.valueOf(firstChar));
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    private double getAccum(String operation) {
        String[] parts = expr.split(operation);

        double accum = 0.0;
        for (String part : parts) {
            accum += Double.parseDouble(part);
        }
        return accum;
    }
}
