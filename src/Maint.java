import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;

public class Maint {
    public static void main(String[] args) {
        ArrayList<Studentc> Al= new ArrayList<>();

        Al.add(new Studentc(1,"Vivek",40));
        Al.add(new Studentc(2,"Vivek",35));
        Al.add(new Studentc(3,"Vivek",50));
        Al.add(new Studentc(4,"Vivek",67));
        Al.add(new Studentc(5,"Vivek",80));
        Al.add(new Studentc(6,"Vivek",70));
        Al.add(new Studentc(8,"Vivek",80));


        Al.sort(Studentc::compareTo);
        int marks = Al.get(0).getMarks();
        int mark =marks;
        for (int x= 0; mark==marks; x++ ){
            mark = Al.get(x+1).getMarks() ;
            System.out.println(Al.get(x));
        }


    }
}
