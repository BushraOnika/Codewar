public class Sum {
    public static  int GetSum(int a, int b)
    {
        int sum=0;
        if (a<b) {
            for (int i = a; i <= b; i++) {
                sum += i;

            }
        }
        else
        {
            for (int i = b; i <=a ; i++) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(GetSum(-1,2));
    }


}
