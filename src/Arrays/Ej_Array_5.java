package Arrays;

import java.util.Scanner;

public class Ej_Array_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] lista = new int[5];
        for (int i = 0; i < lista.length ; i++) {
            System.out.println("Entra el numero");
            int entradaNumeros = entrada.nextInt();
            lista[i] = entradaNumeros;
        }
        for (int elementos:lista) {
            System.out.println(elementos);

        }
    }
}
