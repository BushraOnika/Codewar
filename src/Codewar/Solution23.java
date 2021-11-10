package Codewar;

public class Solution23 {
    public static long sumCubes(long n)
    {
        int sum=0;
        int multi=1;
        for (int i = 1; i <=n ; i++) {
            multi=i*i*i;
            sum+=multi;

        }
        return sum;
        //put your code here :D
    }

}
