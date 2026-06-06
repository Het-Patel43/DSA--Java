import java .util.Scanner;

public class fibonacci {

    public static void main(String[] args){


        // print fibonacci series upto n
        // 0 1 1 2 3  5 8  13 ......


        Scanner sc = new Scanner(System.in);
System.out.println("enter the number to find the nth fibonacci number");
        int n = sc.nextInt();

//         int fibo = 0;
//         int fibo1 = 1;

//         for(int i = 0 ; i<n ; i++){
//   System.out.println(fibo);
//                   int a  = fibo +  fibo1;

//                   fibo = fibo1 ;
//                   fibo1 = a;
                  
//         }

//System.out.println("the nth fibonacci number is " + fibo);



// with while loop -->


int a = 0; 
int b =1 ;
int count =0;
while(count<n){
System.out.println(a);
int c = a +b;
a=b;
b= c;
count +=1;


}
System.out.println("the nth fibonacci number is " + a);

    }
    
}

