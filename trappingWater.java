public class trappingWater {

    public static void  trappedRainwater( int build[] ){

        int n = build.length;
        
        // Calculating Left Max Boundry...!!
        int leftMax[] = new int[n];
        leftMax[0] = build[0];

        for ( int i = 1; i< n; i++){
          leftMax[i] =  Math.max( build[i] , leftMax[i-1] );

        }

        // Creating Right Max Boundry...!!

        int rightMax[] = new int[n];
        rightMax[n-1] = build[n-1]; 

        for( int i = n-2; i>=0; i-- ){
            rightMax[i] = Math.max( build[i] ,rightMax[i+1]); 
        }

        int trappedWater = 0;

        for( int i = 0; i<n; i++ ){

            int waterLevel = Math.min( rightMax[i], leftMax[i] );

         // trappedWater = waterLevel - buildingHeight;
            trappedWater += waterLevel - build[i]; 
        }
        System.out.print("The Volume of trapped Water is: "+ trappedWater );

    }

    public static void main(){

        int building[] = { 4,2,0,6,3,2,5};
        
        trappedRainwater(building);

    }


}
