public class BitWiseAssignment {

    public static int addOne(int n){

    //    int carry = 1 ;

    //    while ( carry != 0 ){

    //     int sum = n ^ carry ;
    //     carry = ( n & carry ) << 1;
    //     n = sum ;

    //    }
    //    return n ;

     n = (-~n);

     return n ;

    }

    public static void swapTwoNos( int n , int m ){

        n = n ^ m; 
        m = n ^ m; 
        n = n ^ m; 

       System.out.print("n: "+ n + ", m: " + m);
        // return new int[]{n,m};

    }

    public static void caseShift(){

        for (char ch = 'A'; ch <= 'Z'; ch++ ){

            System.out.print( (char) (ch | ' '));
        }

    }



    public static void main(String[] args) {
        // System.out.print(addOne(3));

        // System.out.println(7^1);

        // System.out.println(addOne( 3 ));

        // swapTwoNos(3,4);

        caseShift();

        

        

        
        
    }
    
}
