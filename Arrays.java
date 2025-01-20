import java.util.*;

public class Arrays {

    public static void update(int Arr[]){

        for(int i =0; i<Arr.length; i++){

            Arr[i] = Arr[i]+1;

        }

    }

    public static int linearSearch(int Arr[], int key){

        for( int i = 0; i< Arr.length; i++ ){

            if( Arr[i] == key ){

                return i;
            }

        }
        return -1;

    }

    public static void largestNum(int arr[]){

        int val = Integer.MIN_VALUE; // - Infinite

        for ( int i=0; i<arr.length; i++ ){

            if( arr[i]> val ){
                val=arr[i];
            }
        }

        System.out.print("Largest Value is Array is:"+val);

    }

    public static int binarySearch( int arr[] , int key){

        int start = 0 , end = arr.length-1;

        while ( start <= end ){

            int mid = (start + end)/2;

            if ( arr[mid]  == key ){
                 return mid;
            }

            else if ( arr[mid] > key ){
                end = mid -1;
            }

            else if ( arr[mid] < key ){
                start = mid +1;
            }

            
        }
        return -1;
    }
    
    public static void main(){

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

        //     System.out.println("Arr "+ i+" " + Arr[i]);

        // }

        //Linear Search!!

        // int nums[]= {9,19,99,10,89,0};

        // int key = nums[3];

        // int res = linearSearch(nums,key);

        // if( res == -1 ){
        //     System.out.print("NOT FOUND");
        // }
        // else{
        //     System.out.print("Found at index:" + res);
        // }


        // Largest Number Search

        // int nums[]= {9,19,99,10,89,0};

        // largestNum(nums);

        
        // Binary Search

        int nums[]= {1,2,3,4,5,6,7,8};

        int res = binarySearch(nums, 6);

        if(res == -1){
            System.out.println("NOT FOUND!");
        }
        else{
            System.out.println("Found at:"+ res);
        }


    }

}
