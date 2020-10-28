package Arrays;

import java.util.Scanner;

public class Ex_Arrays_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] lista = new int[10];
        int num;
        for (int i = 0; i <lista.length ;i++) {
            num=sc.nextInt();
            lista[i] =num ;
        }
        for (int i = 0; i <1 ; i++) {
            int k, first;
            first=lista[0];
            for (k = 0; k < lista.length-1; k++) {
                lista[k]=lista[k+1];
                
            }
            lista[k]=first;
        }
        for (int i = 0; i < lista.length ; i++) {
            System.out.println(lista[i]);

        }
    }
}
