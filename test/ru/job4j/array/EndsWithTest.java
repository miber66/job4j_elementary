package ru.job4j.array;

import org.junit.Test;

import  static org.hamcrest.Matchers.is;
import  static org.junit.Assert.*;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[]{'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[]{'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}