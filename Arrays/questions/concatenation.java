import java.util.Arrays;

public class concatenation {
    public static void main(String[] args){

int[] num =  { 1 ,2 ,1};
int[] arr = merge(num);
System.out.println(Arrays.toString(arr));

    }

    static int[] merge(int[] nums){
     
        int n = nums.length;
        int[] ans = new int[2 * n] ;

        for(int i = 0 ; i< nums.length ; i++){
ans[i] = nums[i];
ans[i +n] = nums[i] ;

        }

return ans;        
    }

    
}
