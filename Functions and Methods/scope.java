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


// scoping for loops ;

for(int i = 0 ; i<10 ; i++){

    System.out.println(i);
    int num = 90 ; 
       a  = 10;
}

// Anything intialzed outside can be used inside  but vice versa is not possible ;


// Anything intailzed inside the box can be intialzed outside the box;

}


// same goes for string as well ;

    }
    static void random(){
        int num = 10;
        System.out.println(num);
    }
}
