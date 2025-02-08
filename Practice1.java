public class Practice1 {
    public static int[] passedBy(int a, int b[]) {
        a = a+1 ;
        b[0] = b[0] +2 ;
        
        // System.out.println(a);
        // System.out.println(b[0]);

        return new int[]{a , b[0]};
    }
    
    public static void main(){
        
        int arr[] = {20};
        int a = 10;
       int res[] = passedBy(a , arr);

       for(int i =0; i< res.length; i++){
        System.out.println(res[i]);

       }
       System.out.println(a);
        System.out.println(arr[0]);
    }
}