import java.util.Arrays;

public class Long {
    public static int[] digitize(long n) {
        // Code here
        System.out.println(n);
        String s=n+"";

        int[] arr = new int[s.length()];
        for (int i = s.length()-1,j = 0; i >=0; i--,j++) {
            arr[j]=s.charAt(i)-'0';


        }
        return arr;

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(123456)));
    }
}
