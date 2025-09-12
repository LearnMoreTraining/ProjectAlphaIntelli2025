package javabasics;

public class ConditionsOfJava {

    public static void main(String[] args) {

        int a = 1;

        if(a > 2){
            System.out.println("a is greater");
        }
        else if(a == 7){
            System.out.println("a is equal to 7");
        }
        else{
            System.out.println("not greater");
        }

        String name1 = "lmti";
        String name2 = "lmti";

        if(name1.equals(name2)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }
}
