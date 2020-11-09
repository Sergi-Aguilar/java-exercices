package Arrays;

import java.util.Arrays;

public class Ej_Arrays_16 {
    public static void main(String[] args) {
            int[] array = {7, 23, -4};
            int aux;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length-1 ; j++) {
                if (array[j+1]<array[j]){
                    aux = array[j+1];
                    array[j+1]=array[j];
                    array[j]=aux;
                }

            }

        }


    }
}
