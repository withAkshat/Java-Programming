import java.util.*;

public class Assignment {
    
    public static void main(){

        // sum of the even and odd integers

       /* Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;

        for(int i = 0; i<5; i++){
           
            System.out.print("Enter a no ");
            int input = sc.nextInt();
        
            if( input%2 ==0 ){

                System.out.println("Even no " + input);
                even = even + input;
            }

            else{

                System.out.println("Odd no " + input);
                odd = odd + input;
            }
        
        }
        System.out.println("Sum of even nos are " + even );

        System.out.println("Sum of odd nos are " + odd );

         */
        
        
        // Factorial 

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a no for Factorial ");
        // int n = sc.nextInt(); //4


        // int mul = 1;

        // for( int i = n; i>=1; i-- ){

        //     mul = mul * i ; 
        // }

        // System.out.print("Factorial of no "+ n +" is " + mul);


        // Multiplication Table

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number");
    
        int n = sc.nextInt();

        for( int i = 1; i<=10; i++ ){

            System.out.println(n + " * " + i + " = " + n*i);
        }

    }

}
