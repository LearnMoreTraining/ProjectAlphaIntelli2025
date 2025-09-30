package javabasics;

public class StaticNonstatic {

   static int a = 10 ;

    public static void main(String[] args) {
        System.out.println(a);
        StaticNonstatic s = new StaticNonstatic();
        s.m1();

        StaticNonstatic.m3();

        ReturnTypes r = new ReturnTypes();
       int a = r.hello();
    }

    public void m1(){
        int a = 400;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println("m1");
    }

    public void m2(){
        System.out.println(a);
        System.out.println("m2");
    }

    public static void m3(){
        System.out.println(a);
        System.out.println("m3");
    }
}
