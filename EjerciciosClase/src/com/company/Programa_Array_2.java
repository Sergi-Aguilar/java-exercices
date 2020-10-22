package com.company;

import static java.lang.Math.random;

public class Programa_Array_2 {
    public static void main(String[] args) {
        int [] matriz_aleatorios = new  int[150];
        for (int i = 0; i < matriz_aleatorios.length ; i++) {
            matriz_aleatorios[i] = (int) (Math.random() * 20);

        }
        for (int numeros:matriz_aleatorios) {
            System.out.println(numeros);

        }
    }
}
