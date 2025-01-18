public class Palimdrome {

    public static void Palimdrome( int n ){

            int A = n ;

            int rev = 0;

            while(n>0){

                int lastDigit = n % 10; //Extracts last digit.

                rev = ( rev*10 ) + lastDigit;

                n = n / 10;


            }

            if( A == rev ){

                System.out.println(A + " is a Palimdrome!");
            }
            else System.out.println(A + " is not a Palimdrome!");

    }

    public static void main(String args[]){

        Palimdrome( 1001 );

    }
    
}
