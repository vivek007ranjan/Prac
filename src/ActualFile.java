import java.io.*;

public class ActualFile {
    public static void main(String[] args) throws IOException {
        float[] d ={1.1f,2.2f,3.3f,4.789f};

        FileOutputStream fos1 = new FileOutputStream("Algebra.txt");
        DataOutputStream dos1 = new DataOutputStream(fos1);

        dos1.writeInt(d.length);
        for (int i =0; i<d.length;i++)
        {
            dos1.writeFloat(d[i]);
        }
        fos1.close();
        dos1.close();


        FileInputStream fis1 = new FileInputStream("Algebra.txt");
        DataInputStream dis1 = new DataInputStream(fis1);

        int count =dis1.readInt();
        for (int i =0; i<count;i++)
        {
            System.out.println(dis1.readFloat());
        }
        fis1.close();
        dis1.close();

    }
}
