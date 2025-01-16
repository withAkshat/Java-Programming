public class ConsversionNum {
    
    public static int binToDec( int binNum ){

        int dec = 0;
        int pow = 0;
        // int lastDig=1;
        
        while( binNum >0 ){
            
            int lastDig = binNum % 10; //Extract last digit
            dec = dec + (lastDig *(int) Math.pow(2,pow)) ;
            pow++;
            binNum = binNum/10;             //Deleting last digit

        }
        return dec;

    }

    public static int decToBin( int decNum ){

            int pow = 0;
            int binNum = 0;

            while( decNum > 0 ){

                int rem = decNum % 2;
                binNum = binNum +(rem * (int) Math.pow(10,pow));
                pow++;
                decNum = decNum/2;

            }
            return binNum;

    }


    public static void main(){

        // System.out.print(binToDec(101));
        System.out.print(decToBin(7));

    }

}


