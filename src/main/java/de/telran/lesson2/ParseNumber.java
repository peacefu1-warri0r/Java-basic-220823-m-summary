package de.telran.lesson2;

public class ParseNumber {
    public static void main(String[] args) {

        char Character = 'G';
        int Integer = 89;
        byte Byte = 4;
        short Short = 56;
        float Float = 4.7333436f;
        double Double = 4.355453532;
        long Long = 12121;
        System.out.println("Character: " + Character);
        System.out.println("Integer: " + Integer);
        System.out.println("Byte: " + Byte);
        System.out.println("Short: " + Short);
        System.out.println("Float: " + Float);
        System.out.println("Double: " + Double);
        System.out.println("Long: " + Long);

        int myNum = 345;
        int result1 = myNum / 100;
        int result2 = myNum / 10 % 10;
        int result3 = myNum % 10;
        System.out.println(result1 + ", " + result2 + ", " + result3);

    }
}
