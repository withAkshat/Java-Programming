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
    
    public static void main(){

        int arr[] = {1,2,3,4};
        
        boolean val = duplicate(arr);

        System.out.print(val);

    }
    
}
