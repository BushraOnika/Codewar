package Codewar;

public class WithoutLetterE {
    public static String findE(String str){
      int count=0;
        if (str==null){
            return "";
        }
        else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'e'|| str.charAt(i)=='E') {
                    count++;

                }
            }
            if (count>0){
                return count+"";
            }
            else return "There is no \"e\".";
        }

    }

    public static void main(String[] args) {
        System.out.println(findE(null));
    }
}
