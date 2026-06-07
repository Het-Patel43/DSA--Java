public class shadowing {

    static int x = 90 ; // this will be shadowed at line 11 
    public static void main(String[] java){


         System.out.println(x);   

         int x = 40 ;
 // scope will begin when the value is initalized  

          System.out.println(x);   
    fun();
    }
 
    static void fun(){
        System.out.println(x);
  
// x = 40 will be available for the MAIN class only

    }
    
}
