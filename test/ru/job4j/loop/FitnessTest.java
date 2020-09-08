package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int mounth = Fitness.calc(95, 90);
        assertThat(mounth, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int mounth = Fitness.calc(90, 95);
        assertThat(mounth, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        int mounth = Fitness.calc(50, 95);
        assertThat(mounth, is(2));
    }

    @Test
    public void whenIvanEqNik() {
        int mounth = Fitness.calc(90, 90);
        assertThat(mounth, is(1));
    }
}