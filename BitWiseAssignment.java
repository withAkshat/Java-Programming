public class BitWiseAssignment {

    public static int addOne(int n){

       int carry = 1 ;

       while ( carry != 0 ){

        int sum = n ^ carry ;
        carry = ( n & carry ) << 1;
        n = sum ;

       }
       return n ;


    }

    public static void main(String[] args) {
        // System.out.print(addOne(3));

        // System.out.println(7^1);

        // System.out.println(addOne( 3 ));

        System.out.println(~6);
    }
    
}
