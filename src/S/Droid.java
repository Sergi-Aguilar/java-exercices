package S;

import java.util.Scanner;

    public class Droid{
        String name;
        int batterylevel = 100;

        public  Droid(String nameDroid){
            name = nameDroid;

        }
        public String toString(){
            return "The name of the droid is "+name;
        }
        public static void main(String[] args) {
            S.Droid codey = new S.Droid("Codey");
            System.out.println(codey);
        }

}


