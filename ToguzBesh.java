package com.company;

import java.util.Scanner;

public class ToguzBesh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //   while (true) { // while га салып шартын туура деп сканнерден сан сурап койсок кайра кайра салыштырып сан сурап тура берет.
            System.out.println(method(15));
      //  }
    }
    public static String method(int a){
        if (a%2 == 0){
            return "Jup san";
        }else{
            return "Tak san";
        }
    }
}
