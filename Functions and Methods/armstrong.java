import java.util.Scanner;

public class armstrong { 

    public static void main(String[] java){


// Scanner sc= new Scanner(System.in);
// int a  = sc.nextInt();


for(int i = 100; i<=999 ; i++){

    fun(i);
}

    }

    static void fun(int a){

        int org = a;
int c = 0 ;
        while(a>0){
            int rem = a % 10 ;
            c = c + (rem * rem * rem);
            a = a/10;
        }

        if ( c == org){
            System.out.println("the number " + org + " is armstrong number");
        }

    }
    
}
