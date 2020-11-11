package S;

public class DNA {
    public static void main(String[] args){
    /*
    This program says that if your DNA squencing is a protein or not
    */
        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna3;
        int startCon = dna.indexOf("ATG");
        int finCon = dna.indexOf("TGA");
        int add = startCon+finCon;
        if (add%3==0){
            System.out.println("It's a protein!");
        }
        else{
            System.out.println("Not's a protein");
        }
    }
}
