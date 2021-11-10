import java.util.ArrayList;

public class HighestLowest {
    public static String highAndLow(String numbers) {
        Integer n=0;
     try {
          n = Integer.valueOf(numbers);
     }catch (Exception e){
         System.out.println(e);
     }
        int temp = n;
        ArrayList<Integer> array = new ArrayList<Integer>();
        do{
            array.add(n % 10);
            temp /= 10;
        } while  (temp > 0);
        int max = array.get(0);
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (max<array.get(i))
                max=array.get(i);

        }
 for (int i = 0; i < array.size(); i++) {
            if (min>array.get(i))
                min=array.get(i);

        }


        return max+" "+min;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));

    }
}
