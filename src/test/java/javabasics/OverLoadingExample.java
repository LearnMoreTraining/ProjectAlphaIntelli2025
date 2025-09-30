package javabasics;

public class OverLoadingExample {

    public static void main(String[] args) {

        OverLoadingExample loadingExample = new OverLoadingExample();
        loadingExample.m1();
    }

    public void m1(int a){

        System.out.println(a);
    }

    public void m1(String a){
        System.out.println(a);
    }

    public void m1(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    public void m1(int a , String b){
        System.out.println(a);
        System.out.println(b);
    }

    public void m1(){
        System.out.println("hello");
    }
}
