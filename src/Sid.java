public class Sid {
    public static String howMuchILoveYou(int nb_petals) {

            if (nb_petals%6==0)
                return  "not at all";
            else if (nb_petals%5==0)
                return "madly";
            else if (nb_petals%4==0)
                return "passionately";
            else if (nb_petals%3==0)
                return "a lot";
            else if (nb_petals%2==0)
                return "a little";
            else if (nb_petals%1==0)
                return "I love you";
        //your code here :)
        return "Invalid";
    }
}
