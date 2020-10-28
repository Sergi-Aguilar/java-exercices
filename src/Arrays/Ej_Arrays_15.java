package Arrays;

import java.util.Scanner;

public class Ej_Arrays_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[20];
        int num;
        int contador1=0,contador2=0,contador3=0,contador4=0,contador5=0,contador6=0,contador7=0,contador8=0,contador9=0,contador10=0;

        System.out.println("Quieres introducir 20 numeros?");
        System.out.println("1 = si/2=no");
        int res = sc.nextInt();
        if (res==2){
            for (int i = 0; i < lista.length ; i++) {
                lista[i] = (int) (Math.random() * 20);

            }
        }
        else{
            for (int i = 0; i < lista.length ; i++) {
                System.out.println("Introdueix el numero de la array");
                num=sc.nextInt();
                lista[i]=num;
            }
        }
        for (int i = 0; i < lista.length ; i++) {
            if (lista[i]==1){
                contador1++;
            }
            else if(lista[i]==3){
                contador3++;
            }
            else if(lista[i]==4){
                contador4++;
            }
            else if(lista[i]==5){
                contador5++;
            }
            else if(lista[i]==6){
                contador6++;
            }
            else if(lista[i]==7){
                contador7++;
            }
            else if(lista[i]==8){
                contador8++;
            }
            else if(lista[i]==9){
                contador9++;
            }
            else if(lista[i]==10){
                contador10++;
            }
        }
        if (contador1>contador2&&contador1>contador3&&contador1>contador4&&contador1>contador5&&contador1>contador6&&contador1>contador7&&contador1>contador8&&contador1>contador9&&contador1>contador10){
            System.out.println("El numero que mes ha sortit ha sigut el 1 amb un total de "+contador1);
        }
        else if (contador2>contador1&&contador2>contador3&&contador2>contador4&&contador2>contador5&&contador2>contador6&&contador2>contador7&&contador2>contador8&&contador2>contador9&&contador2>contador10){
            System.out.println("El numero que mes ha sortit ha sigut el 2 amb un total de "+contador2);
        }
        else if (contador3>contador1&&contador3>contador2&&contador3>contador4&&contador3>contador5&&contador3>contador6&&contador3>contador7&&contador3>contador8&&contador3>contador9&&contador3>contador10){
            System.out.println("El numero que mes ha sortit ha sigut el 3 amb un total de "+contador3);
        }
        else if (contador4>contador1&&contador4>contador3&&contador4>contador2&&contador4>contador5&&contador4>contador6&&contador4>contador7&&contador4>contador8&&contador4>contador9&&contador4>contador10){
            System.out.println("El numero que mes ha sortit ha sigut el 4 amb un total de "+contador4);
        }
        else if (contador5>contador1&&contador5>contador3&&contador5>contador4&&contador5>contador2&&contador5>contador6&&contador5>contador7&&contador5>contador8&&contador5>contador9&&contador5>contador10){
            System.out.println("El numero que mes ha sortit ha sigut el 5 amb un total de "+contador5);
        }
        else if (contador6>contador1&&contador6>contador3&&contador6>contador4&&contador6>contador5&&contador6>contador2&&contador6>contador7&&contador6>contador8&&contador6>contador9&&contador6>contador10){
            System.out.println("El numero que mes ha sortit ha sigut el 6 amb un total de "+contador6);
        }
        else if (contador7>contador1&&contador7>contador3&&contador7>contador4&&contador7>contador5&&contador7>contador6&&contador7>contador2&&contador7>contador8&&contador7>contador9&&contador7>contador10){
            System.out.println("El numero que mes ha sortit ha sigut el 7 amb un total de "+contador7);
        }
        else if (contador8>contador1&&contador8>contador3&&contador8>contador4&&contador8>contador5&&contador8>contador6&&contador8>contador7&&contador8>contador2&&contador8>contador9&&contador8>contador10){
            System.out.println("El numero que mes ha sortit ha sigut el 8 amb un total de "+contador8);
        }
        else if (contador9>contador1&&contador9>contador3&&contador9>contador4&&contador9>contador5&&contador9>contador6&&contador9>contador7&&contador9>contador8&&contador9>contador2&&contador9>contador10){
            System.out.println("El numero que mes ha sortit ha sigut el 9 amb un total de "+contador9);
        }
        else if (contador10>contador1&&contador10>contador3&&contador10>contador4&&contador10>contador5&&contador10>contador6&&contador10>contador7&&contador10>contador8&&contador10>contador9&&contador10>contador2){
            System.out.println("El numero que mes ha sortit ha sigut el 10 amb un total de "+contador10);
        }



    }
}
