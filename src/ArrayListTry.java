import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListTry {
    public static void main(String[] args) {
        ArrayList<Integer> Al = new ArrayList<>(List.of(10,20,30));
        ArrayList<Integer> Al1= new ArrayList<>(List.of(11,23,34));
        Al.add(1);
        Al.addAll(List.of(10,12,34,33,78,99,77));
        Collections.sort(Al);
        Al.forEach((n)-> testAnother.display(n));
    }
   static void show(int n){
        if(n%2==0)
        System.out.println(n);
    }

}


