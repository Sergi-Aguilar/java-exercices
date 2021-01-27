package practica_examen_uf2;

import java.util.Random;
import java.util.Scanner;

public class ex_metodes_7 {
    public static void main(String[] args) {
    int[][]s=new int[3][3];
    llenarArray(s);
    imprimirArray(s);
    boolean exit;
    do{
        exit= hacerMenu("1- El dia mes fred de l'any\n" +
                "2- El dia mes calorós de l'any\n" +
                "3- La temperatura mitjana de cada mes\n" +
                "4- La diferència entre el dia més fred i més calorços de cada mes\n" +
                "5- Finalitzar el programa",5,s);

    }while(!exit);


    }


    public static void llenarArray(int[][]arrayLlenar){
        Random r = new Random();
        for (int i = 0; i < arrayLlenar.length ; i++) {
            for (int j = 0; j < arrayLlenar[i].length ; j++) {
                arrayLlenar[i][j]=r.nextInt(41+1);
            }
        }
    }

    public static void imprimirArray(int[][]arrayImprimir){
        for (int i = 0; i <arrayImprimir.length ; i++) {
            System.out.println("Mes "+(i+1));
            for (int j = 0; j <arrayImprimir[i].length ; j++) {
                System.out.printf("%d ",arrayImprimir[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean hacerMenu(String menu, int opciones, int[][]ano){
        Scanner sc = new Scanner(System.in);
        System.out.println(menu);
        System.out.println("");
        System.out.println("Elije una opción del 1 al "+opciones);
        int opcion= sc.nextInt();
        while(opcion<1||opcion>5){
            System.out.println("Porfavor elije una opcion correcta");
            opcion=sc.nextInt();
        }
        if(opcion==1){
            diaMasFrioAno(ano);
        }
        else if(opcion==2){
            diaMasCaluroso(ano);
        }
        else if(opcion==3){
            tempMediaMes(ano);
        }
        else if(opcion==4){
            difMasFrioMasCal(diaMasCaluroso(ano),diaMasFrioAno(ano));
        }
        else{
            return true;
        }
        return false;
    }


    public static int diaMasFrioAno(int[][]ano){
        int diaMasFrioTemperatura=41;
        int diaMasFrio=0;
        int mesConDiaMasFrio=0;
        for (int i = 0; i <ano.length ; i++) {
            for (int j = 0; j <ano[i].length ; j++) {
                if(ano[i][j]<diaMasFrioTemperatura){
                    diaMasFrioTemperatura=ano[i][j];
                    diaMasFrio=j;
                    mesConDiaMasFrio=i;
                }
            };
        }
        diaMasFrio++;
        mesConDiaMasFrio++;
        System.out.println("El dia mas frio del año ha sido "+diaMasFrio+" del mes "+mesConDiaMasFrio+ " con una temperatura de "+diaMasFrioTemperatura);
        return diaMasFrioTemperatura;
    }

    public static int diaMasCaluroso(int[][]ano){
        int diaMasCalurosoTemperatura=0;
        int diaMasCaluroso=0;
        int mesConDiaMasCaluroso=0;
        for (int i = 0; i <ano.length ; i++) {
            for (int j = 0; j <ano[i].length ; j++) {
                if(ano[i][j]>diaMasCalurosoTemperatura){
                    diaMasCalurosoTemperatura=ano[i][j];
                    diaMasCaluroso=j+1;
                    mesConDiaMasCaluroso=i+1;
                }
            };
        }
        System.out.println("El dia mas caluroso del año ha sido "+diaMasCaluroso+" del mes "+mesConDiaMasCaluroso+ " con una temperatura de "+diaMasCalurosoTemperatura);
        return diaMasCalurosoTemperatura;
    }

    public static void tempMediaMes(int[][]ano){
        double tmpMedia=0;
        int dividir=0;
        for (int i = 0; i <ano.length ; i++) {
            for (int j = 0; j <ano[i].length ; j++) {
                tmpMedia+=ano[i][j];

            }
            double s = ano[i].length;
            tmpMedia/=s;
            System.out.println("La temperatura media del mes "+(i+1)+" ha sido "+tmpMedia+" grados");
            tmpMedia=0;

        }
    }

    public static int difMasFrioMasCal(int cal, int frio){
        int dif = cal-frio;
        System.out.println("La diferencia es de "+dif+" grados");
        return dif;
    }




}
