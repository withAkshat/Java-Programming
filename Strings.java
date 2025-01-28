public class Strings {

    public static void palindrome() {

        String pal = "racecar";
        int len = pal.length(); // 7
        String res = "";
        for (int i = 0; i <= len / 2; i++) {
            if (pal.charAt(i) != pal.charAt(len - 1 - i)) {
                System.out.print("The String " + pal + "is not a Palindrome");
                return;
            } else {
                res = res + pal.charAt(i);
            }

        }
        if (pal == res) { // So it will return false..!! (pal equals.(res) ) correct
            System.out.print("String is a palindrome");
            // In Java, the == operator checks for reference equality when used with objects
            // like String. It doesn't compare the actual content of the strings. Since pal
            // and res are two different String objects, pal == res will return false even
            // if the content of the two strings is the same.

            // To compare the actual content of strings in Java, you should use the
            // .equals() method
        }

    }

    public static float shortestDist(String path) {

        int n = path.length();

        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            char dir = path.charAt(i);

            if (dir == 'N') {
                y++;
            }
            if (dir == 'S')
                y--;
            if (dir == 'E')
                x++;
            if (dir == 'W')
                x--;

        }

        int x2 = x * x;
        int y2 = y * y;

        float dist = (float) Math.sqrt(x2 + y2);

        return dist;

    }

    public static void concat() {

        String firstName = "Tony";
        String lastName = "Stark";

        String fullName = firstName + " " + lastName; // Concatination

        // System.out.print(fullName);

        for (int i = 0; i < fullName.length(); i++) { // O(n) as only one loop is running..!!
            System.out.print(fullName.charAt(i) + " ");
        }
    }

    public static String subString(String h, int st, int ed) {

        String subString = "";
        for (int i = st; i < ed; i++) {

            subString += h.charAt(i);

        }

        return subString;

    }

    public static void compare() {

        String fruit[] = { "apple", "mango", "banana" };

        String largest = fruit[0];
        for (int i = 1; i < fruit.length; i++) {

            if (largest.compareTo(fruit[i]) < 0) { // Works as lexicographic comparison (ex. m > a)
                largest = fruit[i]; // "compareTo" function goes letter wise so time complexity will be O( x * N )
                                    // where x is length of one string and N is no of total strings..!!
            }

        }
        System.out.print(largest);

    }

    public static void stringBuilder() {

        StringBuilder sb = new StringBuilder("");

        for (char i = 'a'; i <= 'z'; i++) {

            sb.append(i); // O( 26 )
        } // O ( n*n ) in strings
        System.out.println(sb);
        System.out.println(sb.length());

    }

    public static String toUpperCase() {

        String str = "hi mera naam haiiiii kya pata..!!";

        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if ( str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i)); // prints space
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); // Converts into upperCase then append it into sb
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();

    }


    public static String compression(String str){
        String newStr = " ";
        
        for (  int i = 0; i < str.length(); i++ ){
            Integer count = 1;

            while ( i < str.length()-1 && str.charAt(i) == str.charAt(i+1) ){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count >1){
                newStr += count.toString();
            }

        }

        return newStr;
    }

    public static void main() {
        // concat();
        // palindrome();

        // String path = "WNEENESENNN";
        // float res = shortestDist(path);
        // System.out.print(res);

        // String h = "HelloWorld";
        // String res = subString(h, 0, 5);
        // System.out.println(res);

        // System.out.print(h.substring(0,5));

        // compare();

        // stringBuilder();

    //    String res = toUpperCase() ;
    //    System.out.print(res);

        String str = "aabbcc";

        String res = compression(str);

        System.out.print(res);


    }

}
