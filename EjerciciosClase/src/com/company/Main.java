package com.company;

public class Main {

    public static void main(String[] args) {
    /*    int [] my_array = new int[5];
        my_array[0] = 5;
        my_array[1] = 2;
        my_array[2] = 3;
        my_array[3] = 4;
        my_array[4] = 6;
        System.out.println(my_array[0]);
        System.out.println(my_array[1]);
        System.out.println(my_array[2]);
        System.out.println(my_array[3]);
        System.out.println(my_array[4]);
        for (int i = 0; i <my_array.length ; i++) {
            System.out.println(my_array[i]);

        }*/
        String[] countryes =  new String[8];
        countryes[0] = "España";
        countryes[1] = "México";
        countryes[2] = "Colombia";
        countryes[3] = "Perú";
        countryes[4] = "Chile";
        countryes[5] = "Argentina";
        countryes[6] = "Ecuador";
        countryes[7] = "Venezuela";
        /*for (int i = 0; i < countryes.length ; i++) {
            System.out.println(countryes[i]);

        }*/
        int numeroPais =0;
        for (String elemento:countryes){
            numeroPais++;
            System.out.println("Pais "+numeroPais+":  "+elemento);
        }
    }
}
