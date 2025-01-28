public class AssignmentTwoDArray {

    public static void que(  ){

        int[][] arr = { 
            {4,7,8},
            {8,8,7} 
    };

    int count = 0;
    for ( int i = 0; i< arr.length; i++ ){
        for(int j = 0; j<arr[0].length; j++){
        if ( arr[i][j] == 7 ){
            count++;
        }
    }
    }
    System.out.print(count);

    }


    public static void sum(){

        int[][] nums = { 
            {1,4,9},
            {11,4,3},
            {2,2,3} 
        };

        int sum = 0;
        
            for ( int j = 0; j< nums[1].length; j++ ){
                sum = sum + nums[1][j];
                
            }
        
        System.out.print(sum);

    }

    public static int[][] transpose(){

        int[][] nums = { 
            {1,4},
            {11,4},
            {2,2} 
        };

        int row = nums.length;
        int col = nums[0].length;

        // new Transposed matrix

        int[][] transposed = new int[col][row];

        for(int i = 0; i< row; i++){
            for ( int j=0; j<col; j++){
                transposed[j][i] = nums[i][j];
            }
        }
        return transposed; 

    }



    public static void main(){

        // que();
        // sum();
        int[][] nums = transpose();

        for(int i = 0; i< nums.length; i++){
            for ( int j=0; j<nums[0].length; j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

    }
    
}
