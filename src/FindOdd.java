import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindOdd {
//    public static void main(String[] args) {
////        LinkedHashSet<String> meetup=new LinkedHashSet<>();
////
////        meetup.add("Sumit");
////        meetup.add("Nijhum");
////        meetup.add("Stranger");
////        meetup.add("Pranto");
////        meetup.add("Sumit");
////        meetup.add("Nijhum");
////        for (String o :meetup) {
////            System.out.println(o);
//
//
//        }
//
//      //  System.out.println(meetup.size());
//
//    }

public static int findIt(int[] a) {
    int odd=0;
    HashMap<Integer,Integer> gift = new HashMap<>();

    HashMap<Integer,Integer> map = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
        map.put(a[i],0);

    }

    for (Integer i :map.keySet()) {
        if(gift.get(i)%2!=0)
            odd=gift.get(i);

    }


    return odd;
}

    public static void main(String[] args) {
         HashMap<String,Integer> gift = new HashMap<>();
         int[] counts= new int[]{2,3,5,3};
         String[] name = new String[]{"Nijhum","sir","Mama","Mama"};
        for (int i = 0; i < name.length; i++) {
            if (!gift.containsKey(name[i])) {
                gift.put(name[i], counts[i]);
            }else{
                Integer add=gift.get(name[i]);
                int a=counts[i];
                gift.put(name[i],add+a);
            }
        }
        for (String s : gift.keySet()) {
            if(gift.get(s)%2!=0)
            System.out.println(s +" "+gift.get(s));

        }


        System.out.println(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
    }

}
