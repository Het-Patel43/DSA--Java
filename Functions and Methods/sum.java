import java.util.Scanner;

public class sum {
    
    public static void main(String[]args){

sum();
   
}


static void sum(){
System.out.println("enter two numbers");
Scanner sc = new Scanner(System.in);

int num1 = sc.nextInt();
int num2 = sc.nextInt();

int sum = num1 +num2 ;
System.out.print("the sum is :" + sum);

}

}
