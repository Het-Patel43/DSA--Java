import java.util.Scanner;
import java.util.Arrays;

public class multidimension {

    public static void main(String[] args){

/*
       1 2 3    --> 0th index;
       4 5 6    --> 1st index
       7 8 9    --> 2nd index

        imagine this as array of arrays
       
         
*/

int[][] arr = new int[3][3]; // row = 3 , column no need to specify

int[][] a = {

              {1,2,3},
              {4,5,6},
              {7,8,9},

};


Scanner sc = new Scanner(System.in);

//input of multi dimensional array -->

for(int row = 0 ; row <arr.length ; row++){

    // for each row -->

    for(int col = 0 ; col< arr[row].length ; col++){

        arr[row][col] = sc.nextInt();
    }


}




    // for each row -->

//     for(int col = 0 ; col< arr[row].length ; col++){

//        System.out.print(arr[row][col]);

//  }
//     System.out.println();
// }


// using  tostring -->

// for(int row = 0 ; row<arr.length ; row++){ // this is row

//     System.out.println(Arrays.toString(arr[row]));
// }



// using enhanced for loop -->

for(int[] row : arr){

   
    System.out.println(Arrays.toString(row));
}

}


    }
