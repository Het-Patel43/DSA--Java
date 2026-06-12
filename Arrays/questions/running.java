import java.util.Arrays;

public class running {

    public static void main(String[] args){

int[] num = { 1 ,2 ,3,4};
int[] arr = add(num);
System.out.println(Arrays.toString(arr));
    }
static int[] add(int[] nums){
    
    int sum = 0;
    int[] ans = new int[nums.length];

for(int i = 0 ; i < nums.length ; i++){

     sum = nums[i] + sum ;
     ans[i] = sum ;
}

return ans ;


}    

}
