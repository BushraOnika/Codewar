package Codewar;

public class Pandemia {
    public static String findE(String str){
        int count=0;
        if (str==null){
            return null;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
                count++;

            }
        }

            if (count>0){
                return count+"";
            }
            return "There is no \"e\".";
        }

    }

