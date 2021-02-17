package ru.parsentev.task_015;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
@Ignore
public class CycleShiftTest {

    @Test
    public void multi() {
        CycleShift cycle = new CycleShift(new int[] {1, 2, 3, 4, 5});
        int[] result = cycle.shift(2);
        assertThat(result, is(new int[] {4, 5, 1, 2, 3}));
    }

    @Test
    public void one() {
        CycleShift cycle = new CycleShift(new int[] {1});
        int[] result = cycle.shift(2);
        assertThat(result, is(new int[] {1}));
    }

    @Test
    public void negativeShiftTest() {
        CycleShift cycle = new CycleShift(new int[] {1, 2, 3, 4});
        int[] result = cycle.shift(-2);
        assertThat(result, is(new int[] {3, 4, 1, 2}));
    }

    @Test
    public void emptyTest() {
        CycleShift cycle = new CycleShift(new int[] {});
        int[] result = cycle.shift(2);
        assertThat(result, is(new int[] {}));
    }

    @Test
    public void longShiftTest() {
        CycleShift cycle = new CycleShift(new int[] {1, 2, 3});
        int[] result = cycle.shift(5);
        assertThat(result, is(new int[] {2, 3, 1}));
    }

    @Test
    public void moveToOnePositivePositionTest() {
        CycleShift cycle = new CycleShift(new int[] {1, 2, 3, 4});
        cycle.manualMoveToOnePositivePosition();
        assertThat(cycle.getValues(), is(new int[] {4, 1, 2, 3}));
    }

    @Test
    public void moveToOneNegativePositionTest() {
        CycleShift cycle = new CycleShift(new int[] {1, 2, 3, 4});
        cycle.manualMoveToOneNegativePosition();
        assertThat(cycle.getValues(), is(new int[] {2, 3, 4, 1}));
    }

}