import java .util.Scanner;

public class countnums {

    public static void main(String[] args){

Scanner sc  =  new Scanner(System.in);
System.out.println("enter the number");

int n = sc.nextInt();
int count =0;

while(n>0){
    int lastdigit = n % 10 ;
     if(lastdigit == 3){
        count++;

       
     }
      n = n/10;
    }
     

System.out.println("the count of 3 in the number is :" + count);

    }
    
}
