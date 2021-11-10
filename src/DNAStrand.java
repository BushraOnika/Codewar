public class DNAStrand {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        String  s = null;
        if (names.length==0){
            return "no one likes this";
        }
        for (int i = 0; i < names.length; i++) {
          if (names.length==1){
              s= names[i]+" likes this";
          }
          else if (names.length==2){
              s= names[0]+" and "+names[1]+" like this";
          }else if (names.length==3) {
              s = names[0] + ", " + names[1] + " and " + names[2] + " like this";
          }
          else s= names[0] + ", " + names[1] + " and " + (names.length-2) + " like this";

        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
