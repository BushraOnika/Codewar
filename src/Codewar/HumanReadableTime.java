package Codewar;

import java.util.Stack;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        // Do something

        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        if (p1>10 && p2>10 && p3>10){
            return  p2 + ":" + p3 + ":" + p1;
        }
        if (p1<10 && p2<10 &&p3<10) {
            return "0" + p2 + ":0" + p3 + ":0" + p1;
        }
        if (p1<10 && p2<10 && p3>10) {
            return "0" + p2 + ":0" + p3 + ":0" + p1;
        }
        if (p1>10 && p2<10 &&p3<10) {
            return "0" + p2 + ":" + p3 + ":" + p1;
        }
        if (p1<10 && p2>10 &&p3<10) {
            return "0" + p2 + ":0" + p3 + ":" + p1;
        }
        if (p1>10 && p2>10 && p3<10) {
            return  p2 + ":0" + p3 + ":" + p1;
        }
        if (p1<10 && p2>10 && p3>10) {
            return  p2 + ":" + p3 + ":0" + p1;
        }
        if (p1>10 && p2<10 &&p3>10) {
            return "0" + p2 + ":" + p3 + ":" + p1;
        }


        return "";
    }
    public static boolean validParentheses(String parens)
    {
        Stack<Character> s= new Stack<>();
        char x;

        // Traversing the Expression
        for (int i = 0; i < parens.length(); i++)
        {
            if (parens.charAt(i) == '(' || parens.charAt(i) == '['
                    || parens.charAt(i)== '{')
            {
                // Push the element in the stack
                s.push(parens.charAt(i));

                continue;
            }

            // IF current current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (s.empty())
                return false;

            switch (parens.charAt(i)) {
                case ')':

                    // Store the top element in a
                    x = s.pop();
                    s.pop();
                    if (x == '{' || x == '[')
                        return false;
                    break;

                case '}':

                    // Store the top element in b
                    x = s.pop();
                    s.pop();
                    if (x == '(' || x == '[')
                        return false;
                    break;

                case ']':

                    // Store the top element in c
                    x = s.pop();
                    s.pop();
                    if (x == '(' || x == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (s.empty());
    }



    public static void main(String[] args) {

    }


}
