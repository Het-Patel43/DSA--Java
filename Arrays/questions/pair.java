import java.util.Arrays;

public class pair {

    public static void main(String[] args){

int[] arr = {1 ,2 ,3 ,1 ,1 ,4};

  int a = good(arr);
System.out.println(a);

    }

    static int good(int[] arr){
int count = 0;
        for(int i = 0 ; i < arr.length ; i++){

            for(int j = arr.length -1 ; j> i ; j--){

if(arr[i] == arr[j]){
    count++ ;
}

            }
        }

        return count;
    }
    
}
