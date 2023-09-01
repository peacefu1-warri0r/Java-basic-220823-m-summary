package de.telran.lesson2;

public class ParseNumber {
    public static void main(String[] args) {
        int myNum = 345;
        int result1 = myNum / 100;
        int result2 = myNum / 10 % 10;
        int result3 = myNum % 10;
        System.out.println(result1 + ", " + result2 + ", " + result3);

    }
}
