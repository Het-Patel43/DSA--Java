
import java.util.Arrays;
public class searchinstring {

    public static void main(String[] args){

String str = "het patel";
System.out.println(Arrays.toString(str.toCharArray()));

char target = 'p';
boolean ans = search(str , target);
System.out.println(ans);


// POINTS TO REMEMBER -->

/*
    1. unlike in arrays the lenght of string is get by string.length();

    2. to search for an character in an string or to print  character at specific index in a string 
        we do str.charAt(index);

    3. str.toCharArray() --> used to convert string into char[] array 


*/

    }

    static boolean search(String str , char target){

        if(str.length() == 0){
        return false;
        }

        // for(int i =0 ; i< str.length() ; i++){

        //   if(target == str.charAt(i)){
        //     return true ;
        //   }

        // }

for(char ch : str.toCharArray()){
    if(target == ch ){
        return true ;
    }
}

     return false ;

    }
    
}
