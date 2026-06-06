import java.util.Scanner;

public class largest {
    public static void main(String[] args){

// find the largest number in three numbers 


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three numbers");
        int a = sc.nextInt();
         int b = sc.nextInt();
          int c = sc.nextInt();

        // int max = a;
        // if(b>max){
        //     max = b;
        //     System.out.println("largest number is " + max);

        // } 
        
        // else if(c>max){
        //     max = c;
        //        System.out.println("largest number is " + max);
        // }

        // else {
        //        System.out.println("largest number is " + max);
        // }




        // 2nd method 


        // int max = 0;

        // if(a>b){
        //     max = a;
        // }else{
        //     max = b;
        // }

        // if(c>max){
        //     max = c;
        // }


        // System.out.println(max);




        // 3rd method 

        int max  = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
