public class XO {
    public static boolean getXO (String str) {
         int count=0,countsO=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='x'){
                count++;
            }
            else if (str.charAt(i)=='o'){
                countsO++;
            }

        }
        if (count==countsO){
            return true;
        }
        return false;
        // Good Luck!!

    }
}
