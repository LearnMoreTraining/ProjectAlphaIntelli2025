package javabasics;

import io.cucumber.java.mk_latn.No;

public class TryCatchExample {

    public static void main(String[] args) {

        String value = "$100";

        try{
            int val =Integer.parseInt(value);
            System.out.println(val * 2);
        }
        catch(NumberFormatException e){

            int val =Integer.parseInt(value.substring(1));
            System.out.println(val * 2);
        }

    }
}
