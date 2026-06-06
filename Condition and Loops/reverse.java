import java.util.Scanner;

public class reverse {

    public static void main(String[] args){

        // reverse a number 

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        // while(n >0){
        //     int rem = n%10;
        //     System.out.print(rem);


  // n % 10 gives the last digit of the number
         
  
//   n = n/10;

  // n/10 removes th last number from the number


  // this method will print the reverse of a number but 

  //If the input has trailing zeros:

// 1200

// Output:

// 21

// because integers don't preserve leading zeros in the reversed result.

        // }



        // 2nd method -->

        int rev = 0;

while(n>0){

    int rem = n %10;
    rev = rev * 10 + rem;
    n = n/10;
    
}
System.out.println(rev);


    }
    
}
