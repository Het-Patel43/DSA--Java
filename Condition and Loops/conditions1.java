public class conditions1 {

    public static void main(String[] args){


        /*
        
        
        syntax of if statement -->

        if(condition){
            //code to be executed if condition is true}
        
    } else {
            //code to be executed if condition is false
        }
       
        */

int salary = 200;


// if(salary>1000){
//    salary = salary + 2000;
// }

// else {
//     salary = salary + 1000;
// }

// System.out.println(salary);





// Multiple if else statements

if(salary>1000){
    salary += 2000;
}

else if (salary>2000){
    salary += 3000;
}

else {
    salary += 1000;
}


System.out.println(salary);
    }
    
}
