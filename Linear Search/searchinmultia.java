import java.util.Scanner;
import java.util.Arrays;

public class searchinmultia {

    public static void main(String[] args){

int[][] arr = new int[3][3];

Scanner sc = new Scanner(System.in);

System.out.println("Enter the element");

for(int i = 0 ; i<arr.length ; i++){

    for (int j = 0 ; j <arr[i].length ; j++){

        arr[i][j] = sc.nextInt();

     }
  }
 
  for(int i = 0 ; i<arr.length ; i++){

   
       System.out.println(Arrays.toString(arr[i]));

    
   }

   int target = 3 ; 

//    int[] ans = search1(arr , target);

   System.out.println(Arrays.toString(search1(arr,target)));

    System.out.println(max(arr));



}


// static boolean search(int[][] arr , int target){

    

//     for(int i = 0 ; i<arr.length ; i++){

//     for (int j = 0 ; j <arr[i].length ; j++){

//        if(arr[i][j] == target){

//          return true ;   
//        }

//      }
//   }
//   return false ;
    

// }



static int[] search1(int[][] arr , int target){

    

    for(int i = 0 ; i<arr.length ; i++){

    for (int j = 0 ; j <arr[i].length ; j++){

       if(arr[i][j] == target){

         return new int[]{i , j} ;   /* int[] answer = {1, 1};
                                            return answer;  */

        
        // new int[]{i , j} creates a new int which stores value of i and j

        // do this if you want to get index ;

       }

     }
  }

  return new int[]{ -1 ,-1};  
  
    }


    static int max(int[][] arr ){

    int max = arr[0][0] ;

    for(int i = 0 ; i<arr.length ; i++){

    for (int j = 0 ; j <arr[i].length ; j++){

       
if(max < arr[i][j]){

    max = arr[i][j];
}
        

     }
  }
  return max ;
    

}
}
