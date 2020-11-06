package Arrays;

public class Ej_Arrays_13 {
    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length ; i++) {
            array[i]=(int)(Math.random()*5);
            System.out.println(array[i]);

        }
        int bak = array[array.length-1];
        for (int i = array.length-1; i >0 ; i--) {
            array[i]=array[i-1];

        }
        array[0]=bak;
        for (int recorrer:array) {
            System.out.println(recorrer);

        }
    }
}
