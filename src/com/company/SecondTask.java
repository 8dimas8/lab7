package com.company;

public class SecondTask {
    public static void main(String[] args){
        int a = 3;
        int b = 4;
        int c = (int)Math.sqrt(Math.pow(a,2) +Math.pow(b,2));
        int squere = (a * b) / 2;
        int perimeter = a + b + c;
        System.out.println("Площа трикутника:" + squere);
        System.out.println("Периметр трикутника:" + perimeter);
    }
}
