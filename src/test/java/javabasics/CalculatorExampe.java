package javabasics;

public class CalculatorExampe {

    public static void main(String[] args) {

        // 5  10 + 15  - 5 * 50 /

        int a = 5 ;
        int b = 10;
        String operator = "-" ;

        if(operator.equals("+")){
            System.out.println(a+b);
        }
        else if(operator.equals("-")){

            if(a >b){
                System.out.println(a -b);
            }
            else{
                System.out.println(b-a);
            }
        }
        else if (operator.equals("*")){
            System.out.println(a * b);
        }
        else{
            System.out.println("enter valid input");
        }


    }
}
