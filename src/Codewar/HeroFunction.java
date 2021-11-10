package Codewar;

public class HeroFunction {
    public static boolean hero( int bullets,int dragons) {
        if(bullets==(2*dragons)){
            return true;

    }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hero(8,4));
    }
}
