public class Arg {
    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        int count=0;
        double total=p0;

     while (total<=p) {
         count=count+1;
         total = (total + total * percent / 1000.0 + aug);
     }

        return count;
    }


    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
    }

}
