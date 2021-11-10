public class StringToArray {
    public static boolean feast(String beast, String dish) {
      if (beast.charAt(0)==dish.charAt(0) && beast.charAt(beast.length()-1)== dish.charAt(dish.length()-1)) {
          return true;
      }else return false;

    }
    static String greet(String name, String owner) {
        // Add code here
        if (name.equals(owner)){
            return "Hello boss";
        }
        return "Hello guest";
    }
    public static int sum(int[] numbers)

    {
        int sum=0;
        if (numbers==null || numbers== new int[0]){
        return sum;
    }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(max<numbers[i]) {
                max = numbers[i];
            }
            if (min>numbers[i]){
                min=numbers[i];
            }
            sum+=numbers[i];
        }
        return sum-max-min;
    }
    public static String[] stringToArray(String s) {
        //your code;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));

        }
        return null;
    }
    public static int enough(int cap, int on, int wait){
        // your code here
        int sum =(on+wait)-cap;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(enough(10,5,5));
    }
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        // your code here
        return laLigaGoals+championsLeagueGoals+copaDelReyGoals;
    }


}
