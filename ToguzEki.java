package com.company;

import java.util.Scanner;

public class ToguzEki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       ageControl(scanner.nextLine(), scanner.nextLine());
        System.out.println(ageControl("Kyrgyzstan", "Java"));
    }
    static String ageControl(String country, String zapros) {
        if (country == "Kyrgyzstan") {
            if (zapros == "Java") {
                return "JavaRush";
            }return "Google";
            } else {
                return "Oracle";
            }


        }

    }