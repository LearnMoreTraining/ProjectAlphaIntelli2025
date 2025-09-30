package javabasics;

public class Access2 extends AccessmodifierExample{

    static int a = 900;
    public static void main(String[] args) {
        System.out.println(a);
        AccessmodifierExample access2 = new AccessmodifierExample();
       access2.m1();
    }

    public void m1(){
        System.out.println("1");
    }
}
