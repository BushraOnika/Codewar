package Codewar;

public class Square {
    public static int squareDigits(int n) {
        // TODO Implement me
        String number = n+"";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            int a= number.charAt(i)-'0';
            sb.append(a*a);


        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        int n =231;
        squareDigits(9119);
    }
}
