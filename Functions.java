
// import java.util.*;

public class Functions{

    public static int multiply(int a , int b){

        int prod = a*b;
        return prod;
    }


    public static int multiply(int a , int b , int c){

        int prod = a*b*c;
        return prod;

    }
    public static void Add(int a , int b){

        
        // Function Swap
        int temp = a;
        a=b;
        b= temp;

        System.out.println( "Value of A is:" +a);
        System.out.println( "Value of B is:" +b);


        

    }

    public static boolean chkPrime( int n){

        //Corner cases 1,2
        if(n == 2){
            return true;
        }


        for( int i=2; i<=Math.sqrt(n); i++ ){
            if( n%i ==0 ){
                return false;
            }
        }

        return true;

    }

    // Ranges of prime
    public static void primeInRange(int n){

        for (int i=2; i<= n; i++){

            if(chkPrime(i)){
                System.out.print( i +" ");
                // return i
            }

        }

    }


    public static void main(){

        // int A = 1;
        // int B = 4;
        
        // Add(A,B);
        // System.out.println( "Value of A is:" +A);
        // System.out.println( "Value of B is:" +B);

        
        // System.out.println(multiply(10,30));
        // System.out.print(multiply(10,30,3)); //Function Overloading 

        // System.out.print( chkPrime(3) );

        primeInRange(20);
        
    }

}