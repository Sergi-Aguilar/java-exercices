package S;

import java.util.Random;
import java.util.Scanner;

public class Ex_Strings_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digues el nom del fitxer:");
        String letter = sc.nextLine();
        String letter2 = "";
        for (int i = letter.length()-1; i >=0 ; i--) {
            letter2+=letter.charAt(i);

        }
        letter2.toLowerCase();
        int randoms = (int)(Math.random()*9);
        System.out.println(letter2+randoms);
    }
}
