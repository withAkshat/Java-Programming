import java.util.Arrays;
import java.util.*;


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

        public static void stringCompression(){

            String a = "aabccc";

            StringBuilder sb = new StringBuilder(" ");

            for(int i = 0; i < a.length(); i++){
                Integer count = 1; 

                while ( i < a.length() -1 && a.charAt(i) == a.charAt(i+1) ){
                    i++;
                    count ++;
                }
                sb.append(a.charAt(i));

                if( count > 1 ){
                    sb.append( count.toString() );
                }

            }
            System.out.print(sb);

        }

        public static void lowerCaseVowels(){

            String s = "apnaCollege";
            char ch[] = s.toCharArray();

            int count = 0;
            for( int i=0; i<ch.length; i++ ){
                if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){

                count++;

                }
            }

            System.out.print(count);
        }

public static boolean sortedArr(int[] arr , int i) {

    
    if( i == arr.length-1 ){
        return true;
    }
    
    if ( arr[i] > arr[i+1] ){
        return false;
    }
    
    System.out.println(sortedArr(arr, i+1));
    return sortedArr(arr, i+1);

    // Searh in chat gpt why ture is being printed 7 times..!!
    

}

        
public static void main(String args[]){
        
        // int arr[] = {3,2,4};
        
        // int res[] = twoSum(arr , 6); 

        // System.out.print("["+res[0]+ "," + res[1]+"]"); 

        // stringCompression();


        // String st = "aaaappo";
        // System.out.println(st.replace( 'a' , 'x' ));
        // System.out.print(st);
    
    // lowerCaseVowels();    


    // String name = "aman";

    // char arr[] = name.toCharArray();
    // arr[0] = 'e';

    // name = new String(arr);

    // System.out.print(name);

        // int a = 1, b= 4;

        // a = a+1 ;
        // b = b+2 ;
        
        // System.out.print(a+" "+b);
        
        int[] arr = {1,2,3,4};
        
        sortedArr(arr , 0);
    
        
        }
}