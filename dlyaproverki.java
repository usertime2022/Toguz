package com.company;

import java.util.Random;
import java.util.Scanner;

public class dlyaproverki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] massiv = new int[20];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(100);
            System.out.print(massiv[i] + " ");
        }
        System.out.println("\nсан жазыныз: ");
        int san = scanner.nextInt();
        int j = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == san) {
                System.out.println(massiv[i] + " саны массивде [" + i + "]-индексте жайгашкан");
                j++;
            }
            }
            if (j == 0) {
                System.out.println("Массивде мындай сан жок");
            }
        }
    }

