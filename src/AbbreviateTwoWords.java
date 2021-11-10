import java.util.Locale;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        int index = name.indexOf(" ");
        String a = name.charAt(0) +"."+name.charAt(index+1);
        String b = a.toUpperCase();
        return b;
    }
}
