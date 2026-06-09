import java.util.Scanner;

public class primenumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();

        boolean ans = isprime(a);
        System.out.println(ans);



        sc.close();
        

    }

    static boolean isprime(int a){

        if (a <=1 ){
            return false ;
        }

        int c = 2;
        while(c * c  <=a){
            if( a % c == 0){
                return false ;
            }
            c++;
          
            }

            return true;
        }
    }
    

