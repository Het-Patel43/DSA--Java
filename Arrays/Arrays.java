public class Arrays {

    public static void main(String[] args){

// Array is the collection of datatype

/*
Syntax of Array -->

datatype[] variable_name = new datatype[size]; --> Declaration syntax ;

*/

// store 5 roll no -->

int[] rno = new int[5];

// or we can do it directly

int[] rno1 = {1 ,2 ,3,4 ,5 };

//  1 . datatype tell which type of value is stored in arrays
//  2 . All the type of data in the array should be same

       
int[] a ; // declaration of array . a is getting defined in the stack   .    happens at compile time
a = new int[5]; // intialization : actually here object created in the heap memory   .   happens at run time 
   
System.out.println(a[2]); // --> shows 0

// dynamic memory allocation = memory is allocated at runtime / execution time

// a ----> stack
// { 1 ,2 3, 4, 5} -----> heap

// memory blocks are stored contionously ;  contionous memory allocation 

/* But in java memory  may not be contionous -->

  1 . Array objects are in heap 
  2 . heap object are not continous 
  3 . dynamic memory allocation ;

  it depends on jvm 
*/

// index o array or position of an array starts from zero 

System.out.println(rno1[0]);

rno1[0] = 60;

System.out.println(rno1[0]);
// new keyword is used to create an object



// string array -->

String[] arr = new String[4];
System.out.println(arr[0]); // --> shows null (literal) ;

String str = null; // can only be assigned to non premitive

// null is not a datatype or object .

// null is an special value which can be assigned to any reference type

// by default value at what refernce varibale point to

//premitives are stored in stack memorry
// objects stored in heap memory




}
}