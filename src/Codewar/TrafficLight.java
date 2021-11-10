package Codewar;

public class TrafficLight {
    public static String updateLight(String current) {
        if (current=="red"){
            return "green";

        }else if (current=="yellow"){
            return "red";
        }

        return "yellow";
    }
}
