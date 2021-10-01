package Codewar;

public class RockPaperScissor {
    public static String rps(String p1, String p2) {

        // your code
        if (p1==p2){
            return "Draw!";
        }
        else if (p1=="scissors"&& p2=="paper"){
            return "Player 1 won!";
        } else if (p1=="rock"&& p2=="scissors"){
            return "Player 1 won!";
        } else if (p1=="paper"&& p2=="rock"){
            return "Player 1 won!";
        } else if (p1=="scissors"&& p2=="rock"){
            return "Player 2 won!";
        }else if (p2=="scissors"&& p1=="paper"){
            return "Player 2 won!";
        }
        else return  "Player 2 won!";
    }
}
