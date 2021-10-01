public class Kata {
    public static String countingSheep(int num) {
        //Add your code here
        StringBuilder s= new StringBuilder();
        for (int i = 1; i <= num; i++) {
            s.append(i+"sheep...");

        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }
}
