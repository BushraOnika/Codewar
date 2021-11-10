package Codewar;

public class ExpressionMatter {
    public static int expressionsMatter(int a, int b, int c)
    {
        int result1,result2,result3,result4,result5;
        // Your Code here... Happy Coding!
        result1=a * (b + c);
        result2=a * b * c ;
        result3=a + b * c ;
        result4=(a+b)*c;
        result5 = a+b+c;

        if (result1>result2 && result1>result3 && result1>result4 && result1>result5){
            return result1;
        }
        else if(result2>result1 && result2>result3 && result2>result4 && result2>result5){
            return result2;
        }else if (result3>result1 && result3>result2 && result3>result4 && result3>result5){
            return result3;
        }else if (result4>result1 && result4>result2 && result4>result3 && result4>result5){
            return result5;
        }
        else return result5;

    }

}
