package ru.job4j.condition;

public class SqArea {
    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static double square(int p, int k) {
        double h = p / (2 * k + 1); // периметр
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real  = " + result1);
    }
}
