package practica_examen_UF1;

public class BynariSearch {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 11;
        int left =0, right = array.length;
        boolean exit = true;
        while(left<right&&exit){
            int mid = (left+right)/2;
            int midValue = array[mid];
            if(midValue==target){
                System.out.println("Se ha encontrado");
                exit=false;
            }
            else if(midValue<target){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
    }
}
