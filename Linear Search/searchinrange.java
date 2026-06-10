public class searchinrange {

    public static void main(String[] args){

// search for any number in the array in the range of index[1 ,4] or anything ;

int[] arr = { 10 , -1 , 78 , 90 ,3 , 7};

    int target = 78 ;

    boolean ans = search(arr , target);

    System.out.println(ans);


}
static boolean search(int[] arr , int target){

if(arr.length == 0){
    return false ;
}

int start = 1;
int end = 4 ;

for(int i = start ; i<= end ; i++){

    if(arr[i] == target){

        System.out.println(i);
        return true;
    }
}
return false;


}

    
}
