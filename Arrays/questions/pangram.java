

public class pangram {

    public static void main(String[] args){
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/05-arrays.md

        String str=   "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(check(str));
    }
    

    static boolean check(String sentence){

        
  char[] arr = sentence.toCharArray();

;char i ='a';
int count = 0 ;
int j = 0;
     while( j < arr.length){

          if(arr[j]== i){
count++ ;
i++;
j= 0;
          
            }
          }
            if(count == arr.length){
              return true ;
            }
return false ;
        }
        }
    

