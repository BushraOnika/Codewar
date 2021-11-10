public class Formula {
    public static String CalculateAge(int birth, int yearTo) {
        // TODO: your code here
        if (birth==yearTo){
            return "You were born this very year!";
        }
        else if (birth>yearTo) {
            int age = birth - yearTo;
            if (age>1) {
                return "You will be born in " + age + " years.";
            }
            else   return "You will be born in " + age + " year.";
        }
        int age = yearTo-birth;
        if (age>1) {
            return "You are " + age + " years old.";
        }
        else return  "You are " + age + " year old.";
            }
}
