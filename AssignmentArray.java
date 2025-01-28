public class AssignmentArray {

    public static boolean duplicate( int arr[] ){

        for( int i=0 ; i<arr.length-1; i++  ){
            for ( int j = i+1; j<arr.length; j++ ){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;

    }

    public static void searchInSortedArray( int arr[] , int target ){

        int n = arr.length;

        int start = 0; 
        int end = n - 1;

        while( start < end ){

        int mid = ( start + end ) / 2;

        if (arr[mid] > arr[end]){  // Should not be possible..!!

            start = mid +1;

        } else{
            end = mid; 
        }

    }
    int shift = end; // 4 
    
    // System.out.print(start);
    // System.out.print(end);

    start = 0;
    end = n-1;
    
    

    while(start <= end ){
        
        int mid = ( start + end ) / 2;

        int realMid =  ( mid + shift ) % n ;  // Real Position ( where it should be before rotation )


        if( arr[realMid] == target){

           System.out.print("done");

        }

        if ( arr[realMid] > target ){
            end = mid -1;
        }
        else{
            start = mid + 1;
        }

        }
        return;

    }





    
    public static void main(){
        
        int arr[] = {4,5,6,7,0,1,2};
        searchInSortedArray(arr,0);
        
        // int arr[] = {1,2,3,4};
        // boolean val = duplicate(arr);
        // System.out.print(val);

        

    }
    
}
