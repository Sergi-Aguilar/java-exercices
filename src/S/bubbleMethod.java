package S;

public class bubbleMethod {
    public static void main(String[] args) {
        boolean isSorted = false;
        int aux;
        int []array = {4,9,15,1,2};
        int lastUnsorted = array.length-1;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if(array[i]>array[i+1]){
                    aux = array[i+1];
                    array[i+1]=array[i];
                    array[i]=aux;
                    isSorted= false;
                }
            }
            lastUnsorted--;
        }
        for (int elements:array) {
            System.out.println(elements);
        }
    }
}
