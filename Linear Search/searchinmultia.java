import java.util.Scanner;
import java.util.Arrays;

public class searchinmultia {

    public static void main(String[] args){

int[][] arr = new int[3][3];

Scanner sc = new Scanner(System.in);



for(int i = 0 ; i<arr.length ; i++){

    for (int j = 0 ; j <arr[i].length ; j++){

        arr[i][j] = sc.nextInt();

     }
  }
 
  for(int i = 0 ; i<arr.length ; i++){

   
       System.out.println(Arrays.toString(arr[i]));

    
   }

   int target = 10 ; 

   boolean ans = search(arr , target);

   System.out.println(ans);



}


static boolean search(int[][] arr , int target){

    

    for(int i = 0 ; i<arr.length ; i++){

    for (int j = 0 ; j <arr[i].length ; j++){

       if(arr[i][j] == target){

         return true ;   
       }

     }
  }
  return false ;
    

}
}
