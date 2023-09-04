package de.telran.lesson4;

public class HomeWorkCalculator {
    public static void main(String[] args) {

        System.out.println(sum(68, 28));
        System.out.println(subtraction(71, 34));
        System.out.println(multiplication(57, 96));
        System.out.println(division(5, 2));

    }
    public static int sum(int a, int b)
    {
        return a + b;
    }
    public static int subtraction(int a, int b)
    {
        return a - b;
    }
    public static int multiplication(int a, int b)
    {
        return a * b;
    }
    public static double division(double a, double b)
    {
        return a / b;
    }
}
