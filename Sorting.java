public class Sorting {

    public static void bubbleSort( int arr[] ){

        for ( int turns = 0; turns< arr.length-1; turns++ ){
            int swap = 0;
            for (int j = 0; j<arr.length -1 - turns; j++ ){
                if ( arr[j] > arr[j+1]){
                    
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;

                    swap++;

                }
            }
            if(swap !=0){

                System.out.println("swap needed :" + swap);
            }
            else{
                System.out.println("No swap happened");
            }
        }

    }

    public static void printArr( int arr[] ){

        for ( int i= 0; i<arr.length; i++ ){
            System.out.print(arr[i]+ " ");
        }

    }

    public static void selectionSort(int arr[]){

        for(int i = 0; i<arr.length-1; i++){
            int minPos = i; //iss position pr minimum hona chahiyee..!!

            for ( int j =i+1; j< arr.length; j++ ){
                if( arr[minPos] > arr[j] ){
                    minPos = j;
                }
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;

            }
        }
    }

    public static void insertionSort(int arr[]){

        for ( int i =1 ; i<arr.length; i++ ){
            int curr = arr[i];
            int prev = i -1;

            // finding out the correct position to insert

            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev] ; 
                prev -- ;
            }

            // Insertion 
            arr[prev + 1] = curr;

        }

    }

    public static void countingSort(int arr[]){

        // To find range for count array

        int largest = Integer.MIN_VALUE;
        for ( int i = 0; i<arr.length; i++ ){
            largest = Math.max(largest , arr[i]);
        }

        // Creating count array from largest...!!
        int count[] = new int[largest + 1]; 

        // For index of count to increase with the value of original array....
        for (int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }

        // Sorting step
        int j = 0; 
        for (int i = 0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;  
            }
        }

    }

    public static void main(String args[]){
        
        // int arr[] = {5,4,1,3,2};
        int arr[] = {1,4,1,3,2,4,3,7};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);

        countingSort(arr);
        printArr(arr);
        
    }

    
}
