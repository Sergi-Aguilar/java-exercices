package Arrays;

import java.util.Scanner;

public class Ej_Arrays_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector1 = new int[10];
        int[] vector2 = new int[10];
        int[] vector3 = new int[10];
        int num;
        int aux=0;
        int aux2=0;
        for (int i = 0; i <vector1.length ; i++) {
            System.out.println("Entra els numeros del vector 1");
            num=sc.nextInt();
            vector1[i]=num;
        }
        for (int i = 0; i <vector1.length ; i++) {
            System.out.println("Entra els numeros del vector 2");
            num=sc.nextInt();
            vector2[i]=num;
        }
        for (int i=0; i<vector3.length;i++,aux++,aux2++){
            if(i%2==0){
                vector3[i]=vector1[aux2];
                aux--;
            }
            else {
                vector3[i]=vector2[aux];
                aux2--;
            }
            System.out.println(vector3[i]);
        }
    }
}
