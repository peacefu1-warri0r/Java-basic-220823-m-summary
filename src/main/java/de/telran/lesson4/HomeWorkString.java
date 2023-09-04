package de.telran.lesson4;

public class HomeWorkString {

    public static void main(String[] args) {

        String simpleString = new String("I study Basic Java!");
        simString(simpleString);
        System.out.println(simpleString.charAt(simpleString.length() - 2));
        System.out.println(simpleString.contains("Java"));
        System.out.println(simpleString.substring(0, 13) + "!");
        System.out.println(simpleString.replace('a', 'o'));
        System.out.println(simpleString.toUpperCase());
        System.out.println(simpleString.toLowerCase());


    }

    public static void simString(String simJava) {
        System.out.println(simJava);
    }


}

