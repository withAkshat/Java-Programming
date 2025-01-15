public class Stars {

    public static void main(){

    //     for(int i= 1; i<=4; i++){
    //         for( int j=1; j<=i; j++ ){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    // }

    // int n = 4;

    // for(int i= 1; i<=n; i++){
    //     for( int j=1; j<=n-i+1; j++ ){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    // Half Prymaid

    // int n = 5;

    // for(int i= 1; i<=n; i++){
    //     for( int j=1; j<=n; j++ ){
    //         if(i-j>=0){ //row - col >=0;
    //             System.out.print("*");
    //         }
            
    //     }
    //     System.out.println();
    // }

    // Half Prymaid Inverted

    // int n = 5;

    // for(int i= 1; i<=n; i++){
    //     for( int j=1; j<=n; j++ ){
    //         if(i-j<=0){ //row - col >=0;
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
            
    //     }
    //     System.out.print("\n");
    // }


    //top right triangle

    // int n= 5;

    // for (int i=1; i<=n; i++){
    //     for( int j =1; j<=n; j++ ){
    //         if( i + j <=n+1 ){
    //             System.out.print("*");
    //         }
    //         else System.out.print(" "); 
    //     }
    //     System.out.print("\n");
    // }


    // bottom right triangle

    // int n= 5;

    // for (int i=1; i<=n; i++){
    //     for( int j =1; j<=n; j++ ){
    //         if( i + j >=n+1 ){
    //             System.out.print("*");
    //         }
    //         else System.out.print(" "); 
    //     }
    //     System.out.print("\n");
    // }

    
    // Printing X

//     int n= 5;

//     for( int i =1; i<=n; i++ ){
//         for( int j=1; j<=n; j++ ){

//             if( i == j || i+j == n+1 ){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             } 

//         }
//         System.out.print("\n");
//     }


    // Printing K

    // int n= 6;

    // for( int i =1; i<=n; i++ ){
    //     for( int j=1; j<=n; j++ ){

    //         if( j==1 || i+j == 5 || i-j==2 ){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.print("\n");
    // }


    //  Printing A

    // int n= 5;

    // for( int i =1; i<=n; i++ ){
    //     for( int j=1; j<=n; j++ ){

    //         if( j==1 || j== 5 || i== 1 ||i== 3 ){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.print("\n");
    // }

    // Floyd's Triangle

    int n= 5;
    int num =1;
    for( int i =1; i<=n; i++ ){
        for( int j=1; j<=n; j++ ){

            if( i-j>=0 ){
                System.out.print(num+" ");
                num++;
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }
}
    
}
