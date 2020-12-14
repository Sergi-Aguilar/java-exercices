package practica_examen_UF1;

import java.util.Scanner;

public class ex_8_unidimensionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];
        int mitjaPositius=0,mitjaNegatius=0,numeroCeros=0;
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Entra el numero: ");
            int numUser = sc.nextInt();
            array[i]=numUser;
            if(numUser>0){
                mitjaPositius+=numUser;
            }
            else if(numUser<0){
                mitjaNegatius+=numUser;
            }
            else{
                numeroCeros++;
            }
        }
        System.out.println("La mitja dels positius es "+mitjaPositius/5);
        System.out.println("La mitja dels negatius es "+mitjaNegatius/5);
        System.out.println("Hi han "+numeroCeros+" ceros");
    }
}
