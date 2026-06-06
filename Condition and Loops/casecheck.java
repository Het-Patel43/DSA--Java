import java.util.Scanner;

public class casecheck {
    public static void main(String[] args){


        // chech wheter the alphabet is uppercase or lowercase

Scanner sc =new Scanner(System.in);
System.out.println("enter the alphabet");

char ch = sc.next().charAt(0);

if(ch>= 'a' && ch<='z'){
    System.out.println("the alphabet is lowercase");
}

else if(ch>='A' && ch<='Z'){
    System.out.println("the alphabet is uppercase");
}
else{
    System.out.println("INVALID OUTPUT");
}
}




    }
    

