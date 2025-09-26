package javabasics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map <Integer, String> m = new HashMap<Integer,String>();
        m.put(5675,"aravinth");
        m.put(1234,"lmti");

        System.out.println(m);
        System.out.println(m.get(1234));
    }
}
