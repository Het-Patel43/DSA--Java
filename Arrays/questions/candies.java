
import java.util.ArrayList;
import java.util.List;
public class candies {
    public static void main(String[] args){

        int[] arr = { 2 ,4, 8,7 ,1 ,3};
        
       List<Boolean> ar = kidsWithCandies(arr , 3);
       System.out.println(ar);


    }

     static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
int max = 0;

ArrayList<Boolean> extra = new ArrayList<>();
for(int ele : candies){
   
if(ele>max){
    max= ele ;
}
}

for(int ele : candies ){
    int sum = 0;
    sum = ele + extraCandies ;
    if(max > sum){
extra.add(false);
    }

    else{
        extra.add(true);
    }
}

return extra;

  
}
}