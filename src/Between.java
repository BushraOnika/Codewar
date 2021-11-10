import java.util.ArrayList;

public class Between {
    public static int[] between(int a, int b) {
        // your code here
        int[] arr= new int[b-a+1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {

                arr[i]=a;
                a++;


        }
        return arr;
    }
}
