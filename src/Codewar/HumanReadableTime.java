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
   


    public static void main(String[] args) {

    }


}
