public class TestGenericMethod {

    static <T> void Display(T chit){

            System.out.println(chit);
    }

   static <s> void Display(s[] sarr){
        for(s x: sarr){
            System.out.println(x);
        }
   }

    public static void main(String[] args) {

      Display(new Integer[]{1, 2, 3, 4});

    }
}
