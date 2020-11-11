package S;

import java.util.Scanner;

public class Ex_Strings_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra la frase o paraula");
        String letter = sc.nextLine();
        int izquierda = 0;
        int derecha = letter.length()-1;
        boolean polindroma = true;
        //take white spaces
        letter.replace(" ","");
        //take ","
        letter.replace(",","");
        //letter 1 and 2 to lower casse
        letter.toLowerCase();
        while(izquierda<derecha){
            if (letter.charAt(izquierda)==letter.charAt(derecha)){
                izquierda++;
                derecha--;
            }
            else{
                break;
            }
        }

        if(polindroma){
            System.out.println("És palindrom!");
        }
        else{
            System.out.println("No es palindrom");
        }
        }

    }

