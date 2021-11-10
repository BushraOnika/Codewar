package Codewar;

public class TriangleTest {
    public static boolean isTriangle(int a, int b, int c){
        if ((b+c)>a && a>0 && b>0 && c>0){
            return true;
        }
        else if ((a+c)>b && a>0 && b>0 && c>0){
            return true;
        } else if ((a+b)>c && a>0 && b>0 && c>0){
            return true;
        }
        return false;
    }
}
