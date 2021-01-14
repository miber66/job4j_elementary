package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MiniDiapasonTest {
    @Test
    public void whenFirstMin() {
        assertThat(
                MiniDiapason.findMin(
                        new int[] {-1, 0, 5, 10},
                        1, 3
                ),
                is(0)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                MiniDiapason.findMin(
                        new int[] {10, 5, 3, 1},
                        1, 3
                ),
                is(1)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                MiniDiapason.findMin(
                        new int[]{10, 2, 5, 1},
                        0, 2
                ),
                is(2)
        );
    }
}