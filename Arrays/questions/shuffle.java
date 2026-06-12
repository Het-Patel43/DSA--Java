import java.util.Scanner;
import java.util.Arrays;

public class shuffle {

    public static void main(String[] args){


        int[] nums = {1 ,2 ,4 ,5 ,66, 9};
        int[] arr = mix(nums , 3);
System.out.println(Arrays.toString(arr));

    }
    static int[] mix(int[] nums , int n){
        
        int[] ans = new int[nums.length];
        for(int i = 0 ; i<n ; i++){

         ans[2*i] = nums[i];
         ans[(2*i)+1] =   nums[i+n];

            

            }

return ans;
        }
    
    
}
