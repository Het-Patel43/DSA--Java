import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.print("enter the size of array :");
int a  = sc.nextInt();

int[] arr= new int[a];

System.out.println("Enter the array elements :");
for(int j = 0; j <a  ; j++){

    arr[j] = sc.nextInt();

}

System.out.println(Arrays.toString(arr));




System.out.print("Enter the number you want to find :");

int n = sc.nextInt();

int ans = search(arr , n);

System.out.println(ans);


sc.close();

    }

// search in the array --> Return the index if iteam found
// otherwise return -1 

static int search(int[] arr , int n){

    if(arr.length == 0){
        return -1;
    }


//  This is used to get index  -->

    // for(int i = 0 ; i<arr.length ; i++){
        
    //     if(arr[i] == n){

    //         return i ;
    //     }
    

    // this is used to get element -->


for(int ele : arr){

    if(ele == n){
        return ele ; 
    }
}


 return -1 ; // this line will be executed if the element to be searched is not found

}


}

