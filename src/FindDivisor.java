import java.util.List;
import java.util.Locale;

public class FindDivisor {
    public long numberOfDivisors(int n) {
        // TODO please write your code below this comment
        int count=0;
        for (int i = 0; i <=n ; i++) {
            if (n%i==0){
                count++;
            }

        }
        return count;

    }
    public static boolean pointInCircle(double x, double y) {
        // TODO implement the check
        if (x<1 && y<1 && x+y>0 ){
            return true;
        }
        else
        return false;
    }
    public static int[] take(int[] arr, int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=arr[i];

        }
        return a; //your code;
    }
    public static String greet(String name) {

        if(name.equals("Johnny")){
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);
    }

}


class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        for (int i = 0; i < listOfNumbers.size(); i++)
        {
            if (listOfNumbers.get(i)%2 != 0)
            {
                listOfNumbers.remove(listOfNumbers.get(i));
            }
        }
        System.out.println(listOfNumbers);
        return listOfNumbers;
    }
    public static int hexToDec(final String hexString) {
        // Your code here
        {
            int len = hexString.length();

            // Initializing base value to 1, i.e 16^0
            int base = 1;

            int dec_val = 0;

            // Extracting characters as digits from last
            // character
            for (int i = len - 1; i >= 0; i--) {
                // if character lies in '0'-'9', converting
                // it to integral 0-9 by subtracting 48 from
                // ASCII value
                if (hexString.charAt(i) >= '0'
                        && hexString.charAt(i) <= '9') {
                    dec_val += (hexString.charAt(i) - 48) * base;

                    // incrementing base by power
                    base = base * 16;
                }

                // if character lies in 'A'-'F' , converting
                // it to integral 10 - 15 by subtracting 55
                // from ASCII value
                else if (hexString.charAt(i) >= 'A'
                        && hexString.charAt(i) <= 'F') {
                    dec_val += (hexString.charAt(i) - 55) * base;

                    // incrementing base by power
                    base = base * 16;
                }
            }
            return dec_val;
        }
    }
    public static String well(String[] x) {
        // TODO
        int count=0;
        for (int i = 0; i < x.length; i++) {
            if (x[i]=="good"){
                count++;
            }
        }
        if (count==1 || count==2){
            return "Publish!";
        }
        else if (count>2){
            return "I smell a series!";
        }
        return "Fail!";
    }
    public static String multiTable(int num) {
        int multi=1;

       String s ="1 * "+num + " = "+num*1+"\n" +
               "2 * "+num + " = "+num*2+"\n" +
               "3 * "+num + " = "+num*3+"\n" +
               "4 * "+num + " = "+num*4+"\n" +
               "5 * "+num + " = "+num*5+"\n" +
               "6 * "+num + " = "+num*6+"\n" +
               "7 * "+num + " = "+num*7+"\n" +
               "8 * "+num + " = "+num*8+"\n" +
               "9 * "+num + " = "+num*9+"\n" +
               "10 * "+num + " = "+num*10+"\n";

        return s;
    }
    public static String mouthSize(String animal){
        // your code here

        if (animal.toLowerCase(Locale.ROOT)=="alligator" || animal=="ALLIGATOR"){
            return "small";

        }
        return "wide";
    }

    public static void main(String[] args) {
        String s = null;
        int num=5;
        int multi=1;
        for (int i = 1; i <=10 ; i++) {
            multi=i*num;
            s=i+" * "+num+" = "+multi + "\n";
            System.out.print(s);

        }
        System.out.println( mouthSize("ALLIGATOR"));

    }
    public static String howMuchILoveYou(int nb_petals) {




        //your code here :)
        return "I love you";
    }
}
