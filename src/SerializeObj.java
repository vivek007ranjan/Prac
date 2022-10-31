import java.io.*;

public class SerializeObj {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializeStu[] S = new  SerializeStu[3];
        SerializeStu[] I = new  SerializeStu[3];
        S[0]= new SerializeStu("Gajodhar","10");
        S[1] = new SerializeStu("Sanktha","10");
        S[2]= new SerializeStu("Gajodhar","10");

        FileOutputStream fos1 = new FileOutputStream("Stu.txt");
        ObjectOutputStream OOS1 = new ObjectOutputStream(fos1);
        fos1.write(S.length);
        for (int x=0; x<S.length;x++){
            OOS1.writeObject(S[x]);
        }

        OOS1.close();
        fos1.close();

        FileInputStream fis1 = new FileInputStream("Stu.txt");
        ObjectInputStream OIS1 = new ObjectInputStream(fis1);
        int y= (int)fis1.read();
        for (int x=0; x<y;x++){
            I[x]= (SerializeStu) OIS1.readObject();
            System.out.println(I[x]);
        }


        OOS1.close();
        fos1.close();


    }
}
