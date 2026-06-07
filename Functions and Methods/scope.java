public class scope {

    public static void main(String[] args){

// scope means where we can access our variable ;

int a  =10; 
int b =20;

{
   // int a  =70; // ERROR = duplicate varibale a 

   // int a is already intialzed outside the block so it cannot be intialzed again
    
   a = 40 ; // you can reasign the value to ref varibale 

   // value intialized in this block will be only in this block
}

// same goes for string as well ;

    }
    static void random(){
        int num = 10;
        System.out.println(num);
    }
}
