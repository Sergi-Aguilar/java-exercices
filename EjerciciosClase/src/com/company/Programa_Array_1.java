package com.company;

import java.util.Scanner;

public class Programa_Array_1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String[] paises = new String[4];
        String entrarPais="";
        for (int i = 0; i< paises.length ; i++) {
            System.out.println("Entra el pais");
            entrarPais = entrada.nextLine();
            paises[i] = entrarPais;

        }
        for (String elementos:paises) {
            System.out.println(elementos);
        }
    }
}
