public class Factorial {

    public static int factotial(int n ){

        int res =1;

        for ( int i =1; i<=n; i++ ){

            res = res * i;

        }

        return res;
    }


    public static int binCoeff(int n, int r){

        int fact_n = factotial(n);
        int fact_r = factotial(r);
        int fact_nmr = factotial(n-r);
 
        int bin_Coeff = fact_n/ fact_r * fact_nmr ;
        return bin_Coeff;

    }

    public static void main(String args[]){
        
        
        // int factRes = fact(4);
        // System.out.print(factRes);
        System.out.print(binCoeff(3,2));


    }
    
}
