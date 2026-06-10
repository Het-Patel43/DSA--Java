
import java.util.Arrays;
public class Swap {
    public static void main(String[] args){

 int[] arr = { 1 ,2 ,3 ,4, 5, 6};

swap1(arr , 1 , 3);


    }

    static void swap1(int[] arr , int i , int j  ){



    
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp ;

    


System.out.print(Arrays.toString(arr));

    }
    
}
