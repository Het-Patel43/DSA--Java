public class evenno {

    public static void main(String[] args){


int[] arr = { 11 , 22 , 333 ,44323 , 456, 46746, 573453, 223};

System.out.println(findnum(arr));
    }

   // static void even(int[] arr){

// for(int i = 0 ; i<arr.length ; i++){
// int count = 0;
//     int num = arr[i];
//     while(num > 0){
//         int rem = num % 10;
//         num = num /10 ;
//         count++ ;
//     }

//     if( count %2 == 0){
//         System.out.println(arr[i] + " is even digit number" );
//     }

//    else{
//     System.out.println(arr[i] + " is odd digit number" );
//    } 
// }

    //}


static int findnum(int[] arr){

int count =0 ;
for(int num : arr){

    if(even(num)){
        count++;
    }

}

return count;

}


static boolean even(int num){

    int numberofdigits = digits(num);

    return numberofdigits % 2 == 0;
}

static int digits(int num){

    if(num <0 ) {

        num = num * -1;

}

if(num ==0 ){
    return 1;
}

int count = 0 ;
while(num > 0){

    count++;
    num = num/10;
}

return count ;



    
}
}