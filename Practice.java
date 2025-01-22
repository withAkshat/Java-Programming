// public class Practice {

//     public static int binarySearch( int arr[] , int key ){

//         int start = 0 , end = arr.length -1;

//         for ( int i = 0; i< arr.length; i++ ){

//             int mid = (start + end)/2;

//             if( arr[mid] == key ){

//                 return mid;
//             }

//             if ( arr[mid] > key ){
//                 end = mid -1;

//             }

//             else{
//                 start = mid+1;
//             }

//         }

//         return -1;

//     }

//     public static void main(String args[]){

//         int nums[] = { 1,2,3,4,5,6 };
        
//         int res = binarySearch( nums , 5);

//         if ( res == -1){

//             System.out.print("Element Not Found!");
//         }
//         else{
//             System.out.print("Element Found at Index: " + res);
//         }

//     }
    
// }


class Practice {
        public static int[] twoSum(int[] nums, int target) {
        
                for ( int i = 0; i< nums.length; i++ ){
        
                    for ( int j = i+1; j< nums.length; i++ ){
        
                        int sum = nums[i] + nums[j];
        
                        if ( sum == target ){
                            return new int[] {i,j};
        
                        }
                        
                    }
        
                }
        
                return new int[]{};
                
            }
        
            public static void main(String args[]){
        
                int arr[] = {3,2,4};
        
                int res[] = twoSum(arr , 6); 


                System.out.print("["+res[0]+ "," + res[1]+"]"); 
        }
}