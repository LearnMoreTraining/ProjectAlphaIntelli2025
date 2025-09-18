package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(56);
        l.add(77);
        l.add(100);
        System.out.println(l);
        l.add(99);
        System.out.println(l);
        l.add(99);
        System.out.println(l);
        System.out.println(l.get(3));

        for(int a:l){
            System.out.println(a);
        }

        List<String> k = new ArrayList<String>();
        k.add("hello");
        k.add("lmti");
        k.add("learnmore");

        System.out.println(k);



    }
}
