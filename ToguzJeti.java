package com.company;

import java.util.Scanner;

public class ToguzJeti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(method(scanner.nextInt()));
    }
    static int method(int san){
        int count = 0;
        int summa = 0;
        for(int i =1; i<=san;i++){
            summa+=i;
            count++;
            if(i==san){
                System.out.print(i+"=");
            }else{
                System.out.print(i+"+");
            }

        }
        return summa;
    }
}
