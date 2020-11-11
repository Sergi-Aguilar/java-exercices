package S;

import java.util.ArrayList;

public class PrimeDirective {
    public boolean isPrime(int number){
        if(number==2){

            return true;
        }
        if(number<2){
            return false;
        }
        for(int i=2;i<number;i++){
            if(number%2==0){
                return false;
            }

        }
        return true;
    }
    public ArrayList onlyPrimes(int [] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]==2){
                primes.add(numbers[i]);
            }
            else if (numbers[i]%2==0){
                boolean prime = false;

            }
            else if(numbers[i]<2){
                boolean prime = false;
            }
            else{
                primes.add(numbers[i]);
            }
        }
        return primes;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.isPrime(33));
        System.out.println(pd.onlyPrimes(numbers));
    }

}

