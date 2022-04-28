package com.company;

public class ToguzSegiz {
    public static void main(String[] args) {
        System.out.println(method(new int[]{12,23,34,45,7,56,67,78,89}));
    }
    static int method(int[]massiv){
        int minimum = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
        minimum = Math.min(minimum,massiv[i]);
        }
        return minimum;
    }
}
