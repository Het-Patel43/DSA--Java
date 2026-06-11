public class binarysearch{

    public static void main(String[] args){

int [] arr = { 1 ,2 ,3,4 ,5, 6,7, 8, 9,10};
int ans = search(arr , 9);
System.out.println(ans); 

    } 
    // return the index ;

    static int search(int[] arr , int target){

        int start = 0;
        int  end = arr.length - 1;


        while(start <= end){

            // find the miidle element ;

           // int mid = (start + end) / 2 ; // might be possible that (start + end ) it might exceed range of integer ;
        
              int mid = start + (end - start ) / 2;

              if(target < arr[mid]) {
                 end = mid- 1 ;
              }

              else if(target > arr[mid]){
                start = mid + 1;

              }

              else {
                // ans found 
                return mid ;
              }
        }

        return -1  ;
    }
}