import java.util.Scanner;


public class arguments {

    public static void main(String[] args){

// Practice program:
// 1. Passing arguments to methods
// 2. Returning values from methods
// 3. Storing returned values in variables
// 4. Printing the results


int ans = in(24,2); 
System.out.println(ans);

String ans1 = str("hello world");
System.out.println(ans1);

    }
 // Method that takes two integers and returns their sum

static int in(int num1 , int num2){

    int sum = num1 + num2;
    return sum;

} ; 

// Method that takes a string and returns the same string

static String str(String s ){
    
    String abc = s;
    return abc;

} ;
}
