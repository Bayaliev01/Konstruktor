package com.company;

public class Main {
    public static void main(String[] args) {
        Class class1 = new Class(99, "hello world", new int[]{1, 5, 9, 6, 4});
        Class class2 = new Class(33, "salam", new int[]{30, 40, 50, 60});

        System.out.println(class1.getNomer());
        System.out.println(class1.getSoz());
        System.out.println(class1.getSan());
        System.out.println(class2.getNomer());
        System.out.println(class2.getSoz());
        System.out.println(class2.getSan());

    }
}