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
    System.out.println(list.get(i));
}


// or -->


// System.out.println(list);








    }
    
}
