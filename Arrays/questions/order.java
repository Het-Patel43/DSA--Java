
import java.util.ArrayList;
import java.util.Arrays;
public class order {

    public static void main(String[] args){

        int[] nums = { 0 ,1,2,3 ,4};
        int[] index = { 0,1,2,2,1};
System.out.println(Arrays.toString(target(nums , index)));

    }
      static int[] target(int[] nums, int[] index) {
      
    ArrayList<Integer> t = new ArrayList<>();
    int[] ans = new int[nums.length];
    for(int i = 0 ; i< nums.length ; i++){
        t.add(index[i] , nums[i]);
    
       
    }

    for(int i = 0 ; i< nums.length ; i++){
        
        ans[i] = t.get(i);
    
       
    }


    

    return ans ;


    
    }

        
}
