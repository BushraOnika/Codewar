package Codewar;

public class Counter {
    public  static int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int count=0;
        if (arrayOfSheeps==null) return 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] !=null  && arrayOfSheeps[i]== true ){
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  null ,
                false, false, true,  true };
        countSheeps(null);
    }


}
