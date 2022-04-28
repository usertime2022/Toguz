package com.company;

public class ToguzBir {
    public static void main(String[] args) {
        System.out.println(jashTeksheret(18));
        ageControl(17);
    }
    static void ageControl(int age){
        if (jashTeksheret(age)){
            System.out.println("Chondorgo janylyktar");
        }else{
            System.out.println("Jashtarga janylyktar");
        }
    }
    static boolean jashTeksheret(int jash){
        if (jash >= 18){
            return true;
        }else {
            return false;
        }
    }
}
