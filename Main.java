package com.company;

public class Main {

    public static void main(String[] args) {
	int a = method();
        System.out.println(a);
        System.out.println(method());
    }
    static int method(){
        return 12345;
    }
}
