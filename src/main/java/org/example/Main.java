package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random nahodneCislo = new Random();
        int nahCislo = nahodneCislo.nextInt();
        System.out.println(nahCislo);
    }
}