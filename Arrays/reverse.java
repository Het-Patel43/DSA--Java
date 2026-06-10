
import java.util.Arrays;
public class reverse {

    public static void main(String[] args){

int[] arr = {1, 2, 3, 4, 5};

rev(arr);

    }

    static void rev(int[] arr){

int start = 0 ;
int end = arr.length -1 ;

// for(int i = start ; i<= arr.length/2 ; i++){

//     int temp = arr[end - i];
//     arr[end-i] = arr[i];
//     arr[i] = temp;
// }


// 2nd method -->
 
while(start < end){

    int temp = arr[end ];
   arr[end] = arr[start];
        arr[start] = temp;


        start++;
        end-- ;
}
System.out.println(Arrays.toString(arr));
    }
    
}
