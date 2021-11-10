public class Kata2 {
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int count=0,sum=0;
        if (input==null|| input.length==0) {
            return new int[]{};
        }
        int arr[]=new int[2];
        for (int i = 0; i < input.length; i++) {
            if (input[i]>0){
                count++;
            }
            else sum+=input[i];

        }
        arr[0]=count;
        arr[1]=sum;

        return  arr;
    }
}
