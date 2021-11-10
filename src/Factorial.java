public class Factorial {
    public int factorial(int n) {
        // Happy coding :-)
        int multi=1;
        if (n==0){
            return 1;
        }
        else if (n<0 || n>12){
            throw new IllegalArgumentException();
        }
        for (int i = 1; i <=n; i++) {
            multi*=i;

        }
        return multi;
    }
}
