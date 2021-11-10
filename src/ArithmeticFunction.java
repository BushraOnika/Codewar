public class ArithmeticFunction{
        public static int arithmetic(int a, int b, String operator) {
        switch (operator){
            case "add":
                return a+b;
            // your code here
            case "subtract":
                return a-b;
            case "multiply":
                return a*b;
        }
        return (int) (a/(double)b);
}
}
