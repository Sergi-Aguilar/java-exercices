package practica_examen_UF1;

import java.util.Scanner;

public class ex_12_unidimensionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length ; i++) {
            array[i]=5;
            System.out.printf("%d ",array[i]);
        }
        System.out.println("");
        System.out.println("Introdueix una pos");
        int posUser = sc.nextInt();
        int j =0;
        boolean delete = true;
        while(j< array.length&&delete){
            if(j==posUser){
                array[j]=0;
                delete=false;
            }
            else{
                j++;
            }
        }
        for (int i = posUser; i<array.length-1 ; i++) {
            array[i]=array[i+1];
        }
        array[array.length-1]=0;
        for (int i = 0; i < array.length ; i++) {
            System.out.printf("%d ",array[i]);
        }
    }
}
