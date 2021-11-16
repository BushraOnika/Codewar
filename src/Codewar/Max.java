package Codewar;

public class Max {
    public static int sequence(int[] arr) {
        if (arr.length==0 || arr==null){
            return 0;
        }
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum+= arr[i];
            if (sum < 0)
                sum = 0;


            else if (max< sum)
                max = sum;

        }
        return max;
    }
}
