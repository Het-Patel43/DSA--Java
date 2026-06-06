
import java.util.Scanner;

public class switchs {
    /**
     * @param args
     */
    public static void main(String[] args){


Scanner sc = new Scanner(System.in);


//  System.out.println(" enter fruit");
// String fruit = sc.nextLine();

// switch (fruit) {
//     case "mango" -> System.out.println("mango");
//     case "apple" -> System.out.println("apple");
//     case "orange" -> System.out.println("orange");
//     case "grapes" -> System.out.println("grapes");
//     default -> System.out.println("invalid ans");
// }
// enhanced switch done with cntrl + . 






// nested switch -->

int emp = sc.nextInt();
String dept = sc.next();

switch(emp){
    case 1:
        System.out.println("het patel");
        break ;

    case 2:
        System.out.println("krish patel");
        break;

    case 3:
        switch (dept) {
            case "it" -> System.out.println("IT dept");
            case "managment" -> System.out.println("managment dept");
            default -> System.out.println("No department");
        }
        break;

        default:
            System.out.println("enter valid id");
 }

    }
    
    
}
