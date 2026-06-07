
import java .util.Scanner;

public class swap {

    public static void main(String[] args){

        // swap two numbers using functions/methods -->

Scanner sc = new Scanner(System.in);

System.out.print("enter value of a:");
int a  =  sc.nextInt();

System.out.print("enter value of b:");
int b =  sc.nextInt();

System.out.println("Before swap:");

         System.out.println("Value of a:" + a + "Value of b:" + b);

swap1(a ,b);



    }

    static void swap1(int a , int b){

        int temp = b;
        b = a ;
        a = temp;

        System.out.println("After swap:");

         System.out.println("Value of a :" + a + "Value of b :" + b);

    }
    
}
