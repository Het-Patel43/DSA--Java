public class chargreatest{
public static void main(String[] args){

    char[] arr = {'d' , 'f' };

    char c = search(arr , 'f');

    System.out.println(c);
}


static char search(char[] arr , char target){

int start = 0; 
int end = arr.length -1 ;

if(target >= arr[end]){
    return arr[start];


}

while(start<=end){
int mid = start + (end -start)/2;


    if(target >= arr[mid] ){
        start = mid  +1;
    }
    
    
    else  {
        end = mid -1 ;
    }



    

    
    
}
return arr[start];

}
}