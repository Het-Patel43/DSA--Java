public class typecasting {
    public static void main(String[] args){


//  example to understand typecasting in java 

byte b = 40;
char c = 'a';
int i = 78;
float f = 34.7223455f;
double d = 55.678;
long l = 234564322L;

double result = (b * c) + (i / f) - (d * l);

System.out.println((b * c) + " + " + (i / f) + " - " + (d * l) );

System.out.println("the result is " + result);
    

// the result is converted into a double because the highest data type in the expression is double and all the other data types are converted into double before performing the operations. This is called typecasting in java.

    }
    
}
