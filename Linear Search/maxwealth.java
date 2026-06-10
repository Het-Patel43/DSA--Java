public class maxwealth {

    public static void main(String[] args){

int[][] arr = {

                  {1,1 ,1 ,1},
                  {1 ,2 ,0,1},
                  {0,2,1,1},

};

sum1(arr);



    }

    static void sum1(int[][] arr){
int max = 0;
       
    

       for(int i = 0; i < arr.length ; i++){


        int sum = 0;
        for(int j = 0 ; j < arr[i].length ; j++){

         sum = sum + arr[i][j];
         
         
        }

        if(sum > max){
            max= sum;
        }
        
            }

System.out.println(max);
    }
    
}

