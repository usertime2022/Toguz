package com.company;
import java.util.Scanner;
public class ToguzToguzYt9 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <300; i++) {
            if (i%3 == 0 && i%4 == 0 && i%5 == 0){
                count+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Jalpy summasy: "+count);
    }
}
