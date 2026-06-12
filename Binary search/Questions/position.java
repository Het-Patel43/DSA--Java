import java.util.Arrays;

public class position {
    
    public static void main(String[] args){

        int[] arr = {8 ,8 ,8 ,8 ,8,18};
        System.out.println(Arrays.toString(search(arr,8)));
    }
    static int[] search(int[] arr , int t){

       int start = search2(arr, t, true);
        int end = search2(arr, t, false);
       
        return new int[]{start , end};

       
    } 

    static int search2(int[] arr , int t , boolean startindex){


        
        int start = 0 ; int end = arr.length -1 ;
        
        int ans = -1;

        while(start <=end){

            int mid = start + (end - start)/2;
            if(t > arr[mid]){
                start = mid + 1;

            }else if(t< arr[mid]){
                end = mid -1 ;
            }
            else{
                 ans = mid;   
                 if(startindex == true){
                    end = mid -1 ;
                 }else{
                     start = mid +1;

                 }
            }
        }
        return ans ;
    }
}
