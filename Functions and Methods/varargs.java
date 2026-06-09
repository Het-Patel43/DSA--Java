import java.util.Arrays;

public class varargs {
    public static void main(String[] args){

fun(2,3,4,5,6,7);

 multiple(23 , 45 ,"het" , "patel");

    }
    
    static void fun(int ...v){
        System.out.println(Arrays.toString(v)); //  convert array into string to print
    }


    static void multiple(int a ,int b , String ...v){


        // varibale argument paramenters should be at last of the list
    }
}
