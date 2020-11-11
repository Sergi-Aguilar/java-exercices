package Arrays;

public class Ej_Arrays_17 {
    public static void main(String[] args) {
        int [] [] array = new int[4][4];
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Fila 0");
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j] = (int)(Math.random()*5);
                System.out.printf("%d ",array[i][j]);

            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i <array[0].length ; i++) {
            System.out.println("Columna");
            for (int j = 0; j <array.length ; j++) {
                System.out.printf("%d ",array[j][i]);
                System.out.println();
            }
            System.out.println();
        }
    }
}
