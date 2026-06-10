
import java.util.Arrays;

public class min {
    public static void main(String args[]){


int[] arr = { 14,2,-3,4,5,6,7,8,9};


min1(arr);
    }


    static void min1(int[] arr){

        int mini = arr[0];

        for(int i = 0 ;i <arr.length ; i++){

            if(mini > arr[i]){

                mini = arr[i];

            }

        }

        System.out.println(mini);
    }
}