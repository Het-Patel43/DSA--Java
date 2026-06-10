import java.util.ArrayList;
import java.util.Scanner;


public class multial{

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    // create a 2D ArrayList

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();   
    
    // initialization --> "Create a new ArrayList object in memory

    for(int i = 0; i< 3 ; i++){

        list.add(new ArrayList<>());
        
        //"Create an empty ArrayList object and give me its reference."
    }

    // add element-->

    for(int i = 0 ; i<3 ; i++){

        for(int j = 0 ; j < 3 ; j++){

            list.get(i).add(sc.nextInt());
        }

    }

    System.out.println(list);

}

}