package Codewar;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        int count =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if ((a[i] * a[i]) == b[j]) {
                   count++;
                }
            }

        }
        System.out.println(count);
        if (count==a.length*2){
            return true;
        }


        return false;
    }

    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a,b));
    }
}
