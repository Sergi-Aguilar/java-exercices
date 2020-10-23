package Arrays;

import java.util.Scanner;

public class Ej_Array_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] lista = new int[5];
        for (int i = 0; i <lista.length ; i++) {
            System.out.println("Entra el numero");
            int entradaNumeros = entrada.nextInt();
            lista[i] = entradaNumeros;
        }
        int k =4;
        while (k>=0) {
            System.out.println(lista[k]);
            k--;
        }
    }
}
