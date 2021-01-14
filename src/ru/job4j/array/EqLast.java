package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        int last =  left[left.length - 1];
        int last2 = right[right.length - 1];
        return last == last2;
    }
}
