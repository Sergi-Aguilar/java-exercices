package S;

import java.util.Scanner;

public class Registre {
    double tempearture;
    int humity;
    double pressure;
    double temperatureMax;



    public java.lang.String toString() {
        return "La temperatura maxima introduida ha sigut de " +tempearture+" amb la pressió "+pressure+" amb la humitat "+humity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registre reg1 = new Registre();
        Registre reg2 = new Registre();
        boolean getout = true;
        while(getout==true) {
            System.out.println("Introdueix temperatura");
            reg1.tempearture = sc.nextDouble();
            System.out.println("Intdoueix humitat");
            reg1.humity = sc.nextInt();
            System.out.println("Introdueix pressió");
            reg1.pressure = sc.nextDouble();
            sc.nextLine();
            if (reg1.tempearture > reg1.temperatureMax) {
                reg1.temperatureMax = reg1.tempearture;
                reg2.humity = reg1.humity;
                reg2.pressure = reg1.pressure;
                reg2.tempearture = reg1.tempearture;
                }
            System.out.println("Vols introduir registres?");
            System.out.println("s/n");
            String intr= sc.nextLine();
            if(intr.equals("n")){
                getout=false;
            }

        }
        System.out.println(reg2);
    }

}
