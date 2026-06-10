import java.util.Scanner;

import java.util.ArrayList;

 public class arraylist {
    public static void main(String[] args){

        // Array is of fixed sized ;

        // but what if you dont the size of the Array 

        // In that case we use ArrayList ;

        // Syntax -->

     ArrayList<Integer> list = new ArrayList<>(10);

    //  list.add(67);
    //  list.add(69);
    //  list.add(10);
    //  list.add(40);
    //  list.add(7);
    
    //  System.out.println(list);

    // System.out.println(list.contains(67)); // checks wheather the containt is present or not --> true or false

    // list.set(0 , 99); // oth index element changed to 99
    //  System.out.println(list);


    //  list.remove(2);
    //  System.out.println(list);
    

     Scanner sc = new Scanner(System.in);


// input -->

for(int i = 0 ; i< 5 ;i++ ){
    list.add(sc.nextInt());
}

// output -->

for(int i = 0 ; i< 5 ;i++ ){
    System.out.println(list.get(i)); // pass index here , list[index] will not wrk here 
    
    // need to to list.get[index];
}

// or -->

// System.out.println(list);

sc.close();
  }
    
}
/* 
 1. size is fixed internally
 
 2. Say ArraList fills by some amount  --> It will create a new Arraylist of double the size 
 
3 . old elements are copied to new one --> old one is deleted


 */
