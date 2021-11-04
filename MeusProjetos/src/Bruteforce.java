import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.File;

public class Bruteforce {
    public static void main(String[] args) throws FileNotFoundException {
        File tfile = new File("out.txt");
        FileOutputStream fos = new FileOutputStream(tfile);
        PrintStream ps = new PrintStream(fos);
        for(int cont = 900000000; cont <= 999999999; cont++){
            System.setOut(ps);
            System.out.println(cont);
        }
    }
}
