
public class BitWiseOperator {

    public static int getIthBit(int n, int i) {

        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static int setIthBit(int n, int i) {

        int bitMask = 1 << i;

        return (n | bitMask);

    }

    public static int clearIthBit(int n, int i) {

        int bitMask = ~(1 << i);
        return (n & bitMask);

    }

    public static int updateIthBit(int n, int i, int newBit) {

        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;

    }

    public static int clearNBits(int n, int i) {

        // return n & ((~0)<<i);

        int bitMask = (~0) << i;
        return n & bitMask;

    }

    public static int clearRangeOfBits(int n, int i, int j) {

        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1; // 2^(i-1) - 1

        int bitMask = a | b;

        return n & bitMask;

    }

    public static boolean isPowerOfTwo(int n) {

        return (n & (n - 1)) == 0;
    }

    public static int setBitsNo(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // Checks if the lsb is 1
                count++;
            }
            n = n >> 1;
        }
        return count;

    }

    public static int fastExponentiation(int a, int n) {

        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }

        return ans;
        // Time Complexity will ne O(logn +1)
    }

    public static void main(String args[]) {

        // System.out.print(getIthBit( 10 ,2 ));
        // System.out.print(setIthBit( 6 ,0 ));
        // System.out.print(clearIthBit( 7 , 2 ));
        // System.out.print(updateIthBit( 7 , 1 , 1 ));
        // System.out.print(clearNBits( 10 , 2 ));
        // System.out.print(clearRangeOfBits( 15 , 1 , 2 ));
        // System.out.print(isPowerOfTwo( 15));
        // System.out.print(setBitsNo( 16));
        System.out.print(fastExponentiation(3, 3));

    }

}