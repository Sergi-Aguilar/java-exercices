package S;


import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] array = new int[10];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(Math.random()*10);

        }
        boolean isSorted = false;
        int aux;
        while(!isSorted){
            isSorted=true;
            for (int i = 0; i < array.length-1 ; i++) {
                if (array[i]<array[i+1]){
                    aux=array[i+1];
                    array[i+1]=array[i];
                    array[i]=aux;
                    isSorted=false;
                }

            }

        }
        System.out.println("Introdueix el numero a buscar");
        int numSearch = sc.nextInt();
        int countGreater=0;
        int countLess=0;
        for (int i = 0; i <array.length ; i++) {
            if(numSearch<array[i]){
                countLess++;
            }
            else{
                countGreater++;
            }
        }
        System.out.printf("Hi ha %d numeros menors i %d numeros majors i el vector ordenat descendentment és ",countLess,countGreater);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);

        }
    }
}
