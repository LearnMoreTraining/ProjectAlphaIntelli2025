package javabasics;

public class LoopsExample {

    public static void main(String[] args) {

        int [] k = {77,88,99,100}; // 3 //0,1,2

        for(int h:k){
            System.out.println(h);
        }

//        for(int m = 0 ; m < k.length  ; m++){
//
//            System.out.println(k[m]);
//        }

        String[] name = {"lmti","learnmore"};

        for(String e:name){
            System.out.println(e);
        }

        for(int j=0 ; j < name.length ; j++){

            System.out.println(name[j]);
        }
    }
}
