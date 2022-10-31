
import java.io.*;
import java.nio.Buffer;
import java.util.Locale;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Test.txt");
        String str = "Hello Vivek Ranjan and its goin to be a long paara graph that can fir into one byte";
        byte b[] = str.getBytes();
        fos.write(b);
        fos.close();

        FileInputStream fis = new FileInputStream("Test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.skip(2);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.mark(2);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());

        fis.close();


    }

}
