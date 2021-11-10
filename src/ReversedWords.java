public class ReversedWords {
    public static String reverseWords(String str){
          String[] s = str.split(" ");
        String[] s2 = new String[s.length];

        for (int i = s.length-1; i >=0; i--) {
            for (int j = 0; j < s2.length; j++) {
              s2[j] = s[i];
            }
        }

        return s2.toString();
    }
    public static int Past(int h, int m, int s)
    {
        //Happy Coding! ^_^
        return h*3600000+m*60000+s*1000;
    }
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        // Your code here!
        int human= humanYears;
        int cat = 0; int dog = 0;
        if (humanYears==1){
            cat=15;
            dog=15;

        }
        else if (humanYears==2){
            cat=15+9;
            dog=15+9;
        }
        else {
            cat=15+9+(4*(humanYears-2));
            dog=15+9+(5*(humanYears-2));
        }

        return new int[]{human,cat,dog};
    }
    public static String replaceDots(final String str) {
        return str.replaceAll(".", "-");
    }
    public Object[] arguments;

    public Object[] Swapper(final Object[] args){
        arguments=args;
        return arguments;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = args[0];
        args[0] = args[1];
        args[1] = temp;
    }
    public static int[] pipeFix(int[] numbers) {
        // Fix the pipes!
        int[] arr = new int[numbers[numbers.length-1]-numbers[0]];

        for (int i = numbers[0]; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j]=i;
            }


        }
        return arr;
    }
    public static String warnTheSheep(String[] array) {
        //Your code)))
        int count =0;
        int a =0;
        for (int i = 0; i < array.length; i++) {

            if (array[i]=="wolf"){
                a=i;
            }

        }
        if (count==2){
            return "Pls go away and stop eating my sheep";
        }
        return "";
    }


}
