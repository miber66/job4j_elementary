package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean can = left > right;
        int result = can ? left : right;
        return result;
    }

public static void main(String[] args) {
        int num = Max.max(1, 2);
        System.out.println(num);
    }
}
