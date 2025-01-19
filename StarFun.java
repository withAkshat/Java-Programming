public class StarFun {

    public static void hollowRec(int row, int col) {

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("\n");
        }

    }

    public static void inPyramid(int n) {

        for (int i = 1; i <= n; i++) {
            // for( int j =1;j<=n; j++ ){
            // if( i + j > n ){
            // System.out.print("* ");
            // }
            // else{
            // System.out.print(" ");
            // }
            // }

            // System.out.print("\n");

            for (int j = 1; j <= n - i; j++) { // Space printing
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) { // Star Printing
                System.out.print("* ");

            }

            System.out.print("\n");

        }
    }

    public static void inPyNos(int n) {

        for (int i = 1; i <= n; i++) {
            // for( int j = 1; j<= n; j++ ){
            // // System.out.print(j);
            // if( i + j <= n+1 ){
            // System.out.print(j);
            // }
            // }

            for (int j = 1; j <= (n + 1) - i; j++) {
                System.out.print(j);
                System.out.print(" ");

            }

            System.out.print("\n");
        }

    }

    public static void floydsTri(int n) {

        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(num);
                System.out.print(" ");
                num++;

            }
            System.out.print("\n");

        }

    }

    public static void zeroOneTri(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i - j == 0 || i - j == 2 || i - j == 4) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.print("\n");

        }

    }

    public static void butterFly(int n) {

        for (int i = 1; i <= n; i++) {    // For left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
         
            
            for( int j =1; j <=2*(n-i); j++ ){
                System.out.print("  ");
            }
         
            
            for( int j =1; j <= i; j++ ){
                System.out.print("* ");
            }
           System.out.println();
    }
    for (int i = n; i >=1; i--) {    // For left Stars
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
            
        }
     
        
        for( int j =1; j <=2*(n-i); j++ ){
            System.out.print("  ");
        }
     
        
        for( int j =1; j <= i; j++ ){
            System.out.print("* ");
        }
       System.out.println();
}
}

public static void solidRombus( int n ){

    for( int i =1; i<= n; i++ ){
        for( int j=1; j<=n-i; j++ ){
            System.out.print("  ");
        }
        for( int j=1; j<=n; j++ ){
            System.out.print("* ");
        }
        System.out.print("\n");
    }

}

public static void hollwRombus( int n ){

    for( int i =1; i<= n; i++ ){
        for( int j=1; j<=n-i; j++ ){
            System.out.print("  ");
        }
        for( int j=1; j<=n; j++ ){
            if(i==1 || i== n || j==1 || j== n ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.print("\n");
    }

}


public static void rombus( int n ){


    for( int i=1; i<=n; i++ ){

        for( int j=1; j<=n-i; j++  ){
            System.out.print("  ");
        }

        for( int j=1; j<(2*i); j++){
            
            System.out.print("* ");
        }

        System.out.print("\n");
    }

    for( int i=n; i>=1; i-- ){

        for( int j=1; j<=n-i; j++  ){
            System.out.print("  ");
        }

        for( int j=1; j<(2*i); j++){
            
            System.out.print("* ");
        }

        System.out.print("\n");
    }

}

public static void hollowRombus( int n ){

    for( int i =1; i<=n; i++ ){

        for(int j=1; j<=(n-i); j++){
            System.out.print("!");
        }

        for( int j=1; j<=1; j++ ){
            System.out.print("*");
        }

        for ( int j=1; j< (2*i); j++ ){
            System.out.print("!");
        }
        System.out.println();

    }

}


    public static void main(String args[]) {
        // hollowRec( 4, 12 );
        // inPyramid(4);
        // inPyNos(5);
        // floydsTri( 5 );
        // zeroOneTri( 5 );
        // butterFly(4);
        // solidRombus( 5 );
        // hollwRombus( 5 );
        // rombus( 4);
        hollowRombus( 4 );
    }
}

