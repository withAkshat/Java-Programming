import java.lang.reflect.Array;
import java.util.*;

public class Arrays {

    public static void update(int Arr[]) {

        for (int i = 0; i < Arr.length; i++) {

            Arr[i] = Arr[i] + 1;

        }

    }

    public static int linearSearch(int Arr[], int key) {

        for (int i = 0; i < Arr.length; i++) {

            if (Arr[i] == key) {

                return i;
            }

        }
        return -1;

    }

    public static void largestNum(int arr[]) {

        int val = Integer.MIN_VALUE; // - Infinite

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > val) {
                val = arr[i];
            }
        }

        System.out.print("Largest Value is Array is:" + val);

    }

    public static int binarySearch(int arr[], int key) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            else if (arr[mid] > key) {
                end = mid - 1;
            }

            else if (arr[mid] < key) {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void reverseArr(int arr[]) {

        int first = 0, last = arr.length - 1;

        while (first < last) {

            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            // First and last position elements change their position which terminates the
            // loop condition..

            first++;
            last--;
        }

    }

    public static void printPairs(int arr[]) {

        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {

                System.out.print("(" + curr + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total No of pairs are: " + tp);
    }

    public static void subArrays(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }

    public static void maxSubArraySum( int arr[] ){

        int max = Integer.MIN_VALUE;
        int curr = 0;

        int prefix[] =  new int[arr.length];

        prefix[0] = arr[0];
        
        // Creating Prefix Array...
        for(int i=1; i < arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        
        for(int i=0; i < prefix.length; i++){
            // prefix[i] = prefix[i-1] + arr[i];
            System.out.print(prefix[i]+ " ");
        }
        
        for ( int i = 0; i < prefix.length; i++ ){
            for ( int j = i; j < prefix.length; j++ ){
                
                curr = i==0 ? prefix[j] : prefix[j] - prefix[i-1];

                    if( curr > max  ){
                        
                        max = curr;
                    }
            //     for ( int k = i; k<= j; k++ ){
            //         curr = curr + arr[k];
            //     }
            //     System.out.print(curr);
                
            //     curr = 0;
            //     System.out.println();
                
            // }

        }
    }
    System.out.println( "Sum of max Sub Array " + max);

    }

    public static void kadans( int arr[] ){

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for( int i = 0; i < arr.length; i++ ){
            currSum = currSum + arr[i];
            if( currSum <= 0){
                currSum = 0 ;
            }
            if( currSum > maxSum ){
                maxSum = currSum;
            }
        }
        System.out.print("Sum of max Sub Array " + maxSum);

    }

    public static void kadansNeg( int arr[] ){

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for( int i = 0; i < arr.length; i++ ){
            
            currSum = Math.max(arr[i], currSum + arr[i] );
            maxSum = Math.max(currSum , maxSum);
        }
        System.out.print("Sum of max Sub Array " + maxSum);

    }

    public static void main() {

        // int Arr[] = new int[50];

        // Scanner sc = new Scanner(System.in);

        // Arr[0] = sc.nextInt();
        // Arr[1] = sc.nextInt();
        // Arr[2] = sc.nextInt();

        // System.out.println("Marks of Physics:"+ Arr[0]);
        // System.out.println("Marks of Chem:"+ Arr[1]);

        // Arr[2]= Arr[2] + 10;
        // System.out.println("Marks of Maths:"+ Arr[2]);
        // float per = (Arr[0]+Arr[1]+Arr[2])/3;

        // System.out.println("Percentage of Marks are:" + per);

        // int Arr[]= {9,19,99};

        // update(Arr);

        // for ( int i=0; i<Arr.length; i++ ){

        // System.out.println("Arr "+ i+" " + Arr[i]);

        // }

        // Linear Search!!

        // int nums[]= {9,19,99,10,89,0};

        // int key = nums[3];

        // int res = linearSearch(nums,key);

        // if( res == -1 ){
        // System.out.print("NOT FOUND");
        // }
        // else{
        // System.out.print("Found at index:" + res);
        // }

        // Largest Number Search

        // int nums[]= {9,19,99,10,89,0};

        // largestNum(nums);

        // Binary Search

        // int nums[]= {1,2,3,4,5,6,7,8};

        // int res = binarySearch(nums, 6);

        // if(res == -1){
        // System.out.println("NOT FOUND!");
        // }
        // else{
        // System.out.println("Found at:"+ res);
        // }

        // Reverse Array

        // int nums[]= {1,2,3,4,5,6,7,8};

        // reverseArr(nums);

        // for ( int i =0; i< nums.length; i++ ){

        // System.out.print(nums[i]+" ");
        // }

        // Print Pairs

        // int nums[] = { 2, 4, 6, 8 };

        // printPairs(nums);

        
        // // subArrays

        // int nums[] = { 2, 4, 6, 8 };

        // subArrays(nums);


        // // maxSubArraySum

        // int nums[] = { 1,-2,6,-1,3};

        // maxSubArraySum(nums);


        // Kadans Algorithm

        // int nums[] = { 1,-2,6,-1,3};

        // kadans(nums);


        //Kadans Algo for negative no

        int numN[] = {-4,-1,-2,-3};
        
        kadansNeg(numN);

    }

}
