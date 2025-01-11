
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // System.out.println ( "****" );
        // System.out.print ( "***\n" );
        // System.out.println ( "**" );
        // System.out.print ( "*" );

        // Code to calculate sum
        // int a = 1;
        // int b = 2;

        // int sum = a+b;

        // System.out.print(sum);

        // Code to take input

        // Scanner sc = new Scanner ( System.in );
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int product = a * b;

        // System.out.println(product);

        // Code to calculte area of a circle
        /*
         * Scanner sc = new Scanner( System.in );
         * Double rad = sc.nextDouble();
         * 
         * Double area = 3.14 * rad * rad ;
         * 
         * System.out.println(area);
         */

        // Type conversion

        // int a = 314 ;
        // long b ;

        // b = a;

        // // System.out.println(b);

        // Scanner sc = new Scanner(System.in);

        // float input = sc.nextInt();
        // System.out.print(input);

        // Type Casting

        // float a = 99.99f;
        // int b = (int) a;

        // char a = 'a';
        // int b = a ;

        // System.out.println(b);

        // Type promotion in expression

        // short a = 1;
        // byte b = 2 ;
        // char c = 'a';
        // byte d = (byte) (a + b + c) ;

        // System.out.println(d);

        // int a = 12;
        // float b = 2f;
        // long c = 1;
        // float d =a + b + c ;

        // System.out.print(d);

        /*
         * byte b = 12;
         * b =(byte) (b*2);
         * 
         * System.out.print(b);
         */

        // int x = 2;
        // int y = 5;

        // int exp1 = ( x * y / x );
        // int exp2 = ( x * (y / x) );

        // System.out.print(exp1 + ",");
        // System.out.print(exp2);

        // int A = 5 ;
        // int result = ~A;

        // System.out.println(result);

        // int x = 200, y = 50, z = 100;
        // if (x > y && y > z) {
        // System.out.println("Hello");
        // }
        // if (z > y && z < x) {
        // System.out.println("Java");
        // }
        // if ((y + 200) < x && (y + 150) < z) {
        // System.out.println("Hello Java");
        // }

        // int x, y, z;
        // x = y = z = 2;
        // x += y; //4
        // y -= z; //0
        // z /= (x + y); //00
        // System.out.println(x + " " + y + " " + z);

        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;
        // int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b *
        // y);
        // System.out.println(exp);

        // int x = 10, y = 5;
        // int exp1 = (y * (x / y + x / y));
        // int exp2 = (y * x / y + y * x / y);
        // System.out.println(exp1);
        // System.out.println(exp2);

        // System.out.print( 5 & 3 );
        // System.out.print( 4 | 8 );


        // Scanner sc = new Scanner(System.in);
        // int A = sc.nextInt();

        // if (A % 2 == 0){
        //     System.out.println("A is even");
        // }
        // else{
        //     System.out.println("A is odd");
        // }

        // Scanner sc = new Scanner(System.in);

        
        // int income = sc.nextInt() ;
        // int tax;

        // if ( income <= 500000 ){
        //     tax = (int) (income * 0) ;
        //     System.out.print("Your tax amount "+tax);
        // }

        // else if( income > 500000 && income < 1000000 ){
        //     tax = (int) (income * 0.2);
        //     System.out.print("Your tax amount "+tax);
        // }

        // else{
        //     tax = (int) (income * 0.3);
        //     System.out.print("Your tax amount "+tax);
        // }

        // int A , B , C ;

        // A = 10;
        // B = 3;
        // C = 4;

        // if (A>B && A>C){
        //     System.out.print("A is Largest as " + A);
        // }
        // else if ( B>C ){
        //     System.out.print("B is Largest as" + B);
        // }
        // else{
        //     System.out.print("C is Largest as" + C);
        // }


        // Scanner sc = new Scanner(System.in);
        // int Marks = sc.nextInt() ;

        // String Status = (Marks>=33)?"Pass":"Fail";

        // System.out.print(Status);
        

        // int number = 2;

        // switch(number){
        //     case 1:
        //             System.out.print("Fan is on");
        //             break;

        //     case 2:
        //         System.out.print("Light is on");
        //         break;

        //     case 3: 
        //         System.out.print("Ac is on");

        //     default:
        //         System.out.print("No Happend");
        //         break;
        // }


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no.");
        // int n = sc.nextInt();
        // int sum = 0;
        
        // int i= 1 ;
        // while ( i <= n ){
            
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.print("sum " + sum);
        // // System.out.print("Printed Hello World 10 times....!!");


        // for(int row = 1; row <= 4; row++){
        //     System.out.println("* * * *");
        // }
        
        // int row = 1;
        
        // while( row <= 4 ){
        //     System.out.println("* * * *");
        //     row++;
        // }


        // int n = 80085;
        // int  rev = 0;

        // while(n>0){
            
        //     int lastDigit = n % 10;
        //     rev = (rev * 10) + lastDigit;
        //     n = n / 10; //Yahan loop ruka hai..!!
            
        // }

        // System.out.print(rev);


        // Do while loop

        // int counter =1;
        // do{
        //     System.out.println("Hello World!");
        //     counter++;
        // }
        // while( counter<=10 );


        // Scanner sc = new Scanner(System.in);
        
        // while(true){
        //     System.out.print("Enter any no ");
        //     int n = sc.nextInt();

        //     if ( n % 10 == 0 ){
        //         break;
        //     }

        //     System.out.println(n);

        // }





        // int i=1;
        //     do{
                
        
        //         // if(i==3){
        //         //     continue;
        //         // }
            
        //         System.out.println(i);
        //         i++;
        //     }
        //     while( i<=5 ); 
        
        
        // for(int i=1; i<=5; i++){

        //     if(i==3){
        //         continue;
        //     }

        //     System.out.println(i);

        // }


        // int i= 1;
        // while(i<= 5){

        //     System.out.println(i);
        //     if(i==3){
        //                 continue;
        //             }
        //     i++;
        // }


        // Prime Nos


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
        sc.close();
    }
}
