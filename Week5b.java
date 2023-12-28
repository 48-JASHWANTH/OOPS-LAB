import java.io.File;
import java.util.Scanner;
public class Week5b {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter file name:");
            String name = s.next();
            File f = new File(name);
            if(f.exists()){
                System.out.println("File exists");
            }
            if(f.canRead()){
                System.out.println("File is Readable");
            }
            if(f.canWrite()){
                System.out.println("File is Writable");
            }
            System.out.println("The length of the file is:"+f.length());
        }
    }
}
