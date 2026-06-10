

public class max {
    public static void main(String[] args){


        int[] arr = { 1,2 ,3 ,4, 5, 6};

        max1(arr);

    }

    static void max1(int[] arr){

int maxi = arr[0];

for(int i =1 ; i< arr.length ; i++){

if(maxi < arr[i]){
   
    maxi = arr[i];
}

 


    }
    System.out.println("maximum value is " + maxi);

    
    }
}