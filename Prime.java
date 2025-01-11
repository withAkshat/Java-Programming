import java.util.*;

public class Prime {
    

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();

        if( num == 2){
            System.out.print( num +"is prime no");
        }
        else{

            boolean isPrime = true;
            for( int i = 2; i <= Math.sqrt(num); i++ ){
                if( num % i == 0 ){
                    isPrime = false;
                }
            }

            if( isPrime == true){
                System.out.println(num +" is not prime");
            }
            else{
                System.out.println(num +" is not prime");
            }

        }
    }
}
