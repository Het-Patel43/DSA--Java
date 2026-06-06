import java.util.Scanner;

public class calculator {
    public static void main(String[] args){


Scanner sc = new Scanner(System.in);



while(true){

    System.out.println("enter the operator");
     System.out.println("Type X to exit");


char op = sc.next().charAt(0);

if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){


    System.out.println("enter the number 1");
int a = sc.nextInt();
System.out.println("enter the number 2");
int b = sc.nextInt();



      if (op == '+'){
        System.out.println(a+b);
      }

      else if(op == '-'){
        System.out.println(a-b);
      }

      else if(op == '*'){
        System.out.println(a*b);
      }

      else if(op == '/'){
        if(b == 0){
            System.out.println("invalid input");
            
        }else{

        System.out.println(a/b);
        }
      }

      else if(op == '%'){
        System.out.println(a%b);
      }
}

else if(op == 'x' || op == 'X'){
    System.out.println("Successfully exited");
    break;
}

else {
    System.out.println("invalid operator");
}


}

    }
    
}
