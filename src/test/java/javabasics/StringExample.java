package javabasics;

public class StringExample {

    public static void main(String[] args) {

        String name1 = "learn more";
        String name2 = "              Learn More       ";

        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name1.toUpperCase());
        System.out.println(name2.toLowerCase());

        System.out.println(name1.substring(1));
        System.out.println(name1.substring(1,5));
        System.out.println(name2);
        System.out.println(name2.trim());

    }
}
