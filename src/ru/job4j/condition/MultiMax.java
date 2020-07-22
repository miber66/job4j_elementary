package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        return (first > second) ? ((first > third) ? first : third) : ((second > third) ? second : third);
    }

    public static void main(String[] args) {
        int result = MultiMax.max(1, 4, 2);
        System.out.println(result);
    }
}
