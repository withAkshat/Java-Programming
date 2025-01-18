public class NumbersPlay {
    

    public static void sumInt( int n ){

        int a = n;
        int sum = 0;

        while (n>0){

            int lastDigit = n % 10 ;

            sum = sum + lastDigit;

            n = n/10;



        }

        System.out.println("Sum of Integer "+ a + " is "+ sum);

    }

    public static void main(String args[]){

        // sumInt(1923);

        double a = 28;
        double b = 30;

        // System.out.println(Math.max(a,b));
        // System.out.println(Math.min(a,b));
        // System.out.println(Math.pow(a,b));
        // System.out.println(Math.log(a));
        // System.out.println(Math.log(b));
        // System.out.println(Math.log10(a));
        // System.out.println(Math.log10(b));
        // System.out.println(Math.log1p(a));  // return the log of 1 + a
        // System.out.println(Math.exp(a));

        double c =Math.toRadians(b);

        System.out.println(Math.sin(c));
        System.out.println(Math.cos(c));
        System.out.println(Math.tan(c));

    }

}
