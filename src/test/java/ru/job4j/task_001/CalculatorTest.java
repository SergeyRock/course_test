package ru.job4j.task_001;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author job4j
 * @since 19.07.2016
 */
public class CalculatorTest {

    @Test
    public void whenAddOneOnOneThenResultTwo() throws Exception {
        Calculator calc = new Calculator();
        calc.add(1d, 1d);
        assertThat(calc.getResult(), is(2d));
    }

    @Test
    public void whenSubtractOneOnOneThenResultZero() throws Exception {
        Calculator calc = new Calculator();
        calc.subtract(1d, 1d);
        assertThat(calc.getResult(), is(0d));
    }

    @Test
    public void whenMultipleOneOnOneThenResultOne() throws Exception {
        Calculator calc = new Calculator();
        calc.multiple(1d, 1d);
        assertThat(calc.getResult(), is(1d));
    }

    @Test
    public void whenDivOneOnOneThenResultOne() throws Exception {
        Calculator calc = new Calculator();
        calc.div(1d, 1d);
        assertThat(calc.getResult(), is(1d));
    }

    @Test(expected = IllegalStateException.class)
    public void whenDivByZeroThenException() throws Exception {
        Calculator calc = new Calculator();
        calc.div(1d, 0d);
    }

    @Test
    public void whenExpandOneOnOneThenResultOne() throws Exception {
        Calculator calc = new Calculator();
        calc.expand(1d, 1d);
        assertThat(calc.getResult(), is(1d));
    }

    @Test
    public void whenExpandTwoOnTwoThenResultFour() throws Exception {
        Calculator calc = new Calculator();
        calc.expand(2d, 2d);
        assertThat(calc.getResult(), is(4d));
    }
}