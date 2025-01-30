import java.util.Scanner;

public class custom {
    
    static int dataTypeSize(String str) {
        
        if ( str.equals("Character")  || str.equals("character") ){
            return 2;
        }
        
       if ( str.equals("Integer") || str.equals("integer") ){
            return 4; 
        }
        
        if ( str.equals("Long") ||str.equals("long") ){
            return 8;
        }
       if (str == "Float" || str.equals("float")){
            return 4;
        }
        if(str.equals( "Double") || str.equals("double")){
            return 8;
        }
        
        
        return -1;
        
    }
    
    public static void main( String args[] ){
        
        Scanner sc= new Scanner(System.in);
        String input = sc.next();
        
        int res = dataTypeSize(input);
        
        if (res == -1){
            System.out.print("You Entered Wrong Input");
        }
        else{
            System.out.print(res + " byte");
        }
}

}
