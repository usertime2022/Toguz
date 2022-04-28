package com.company;

import java.util.Arrays;

public class ToguzTortBir {
    public static void main(String[] args) {
        System.out.println(google1()+" "+google2());
        System.out.println(google2());
        System.out.println(Arrays.toString(google3()));
        int intsumma = sum(10,20);
        System.out.println("Summasy: "+intsumma);
    }
    public static int google1() {
        return 5;
    }
    public static boolean google2() {
        return true;
    }
    public static int[]google3(){
        return new int[]{1,2,3,4,5};
    }
    public static int sum(int a, int b){
        return a+b;
    }
}

