public class Recursion {

    public static void printDec(int n ){
        

        if(n==1){  // Base Condition...!!
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){

        if( n == 1 ){
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");  // After return all the statement will start executing..!!
    }

    public static int factN( int n ){

        if( n ==0 ){
            return 1;
        }

        int fnm1 = factN(n-1);  // Assume sum will be claculated any how
        int factN = n * fnm1;

        return factN;
    }

    public static int sumN(int n){

        if ( n == 1 ){
            return 1;
        }

        int snm1 = sumN(n-1);
        int sumN = n + snm1;

        return sumN;
    }

    public static int fib( int n ){

        if ( n == 0 || n == 1){
            return n;
        }


        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);

        int fibn = fnm1 + fnm2;

        return fibn;
    }

    public static boolean isSorted( int arr[] , int i){

        if( i == arr.length-1){
            return true;
        }

        if ( arr[i] > arr[i+1] ){
            return false;
        }

        return isSorted(arr , i +1 );

        

    }

    public static void main(){
        // printDec(10);

        // printInc(5);

        // System.out.print(sumN(5));

        // System.out.println(fib( 25 ));

        int arr[] = {1,2,3,4,5};
        
        System.out.print(isSorted(arr , 0));
    }
    
}
