import java.io.IOException;

public class StuRegistration {
    public static void main(String[] args) throws Exception {
            try {
                Stu S1 = new Stu(1, "Ashu", "10th");
                System.out.println(S1.getName());
                Stu S2 = new Stu(-1, "Dholu", "12th");
                System.out.println(S2.getName()+" "+S2.getrollNum());
            }
            finally{
                System.out.println("_/\\_  ");
            }

    }
}
