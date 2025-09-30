package javabasics;

public class ConstructorExamples {

   static int a ;

    public ConstructorExamples(){
        a = 5;
    }

    public ConstructorExamples(int a){
        this.a = a;
    }

    public ConstructorExamples(String a){

    }


    public static void main(String[] args) {
        ConstructorExamples c = new ConstructorExamples(78);

        System.out.println(a);
    }

    public void m1(){


    }
}
