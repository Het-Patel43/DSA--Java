import java.util.Scanner;

import java.util.Arrays;


public class input {

    public static void main(String[] args){

int[] arr = new int[5];
arr[0] = 10 ;
arr[1] = 20 ;
arr[2] = 30 ;
arr[3] = 40 ;
arr[4] = 50 ;

// [10 ,20, 30, 40 , 50 ]

// System.out.println(arr[5]); --> index out of bound error 


// input throght for loop -->


Scanner sc = new Scanner(System.in);

int[] a = new int[5];

for(int i =0 ; i<a.length ; i++){
    System.out.println("enter the number :");
    a[i] = sc.nextInt();

}

for(int i =0 ; i<a.length ; i++){
    System.out.println(a[i]);
}
 
 // ---> to directly iterate over the data without indexes we use enhanced for loop

 for(int b : arr ){

    System.out.println(b); // here b reperesent element of the array
 }

// Print the Array using toString();

System.out.println(Arrays.toString(arr)); // converts array into string and then prints it




// Array of object -->

String[] str = new String[4];

for(int i =0 ; i<str.length ; i++){
    System.out.println("enter the String:");
    str[i] = sc.nextLine();
}

for(String st : str){
System.out.println(st);

}

 

sc.close();
    }
    
}
