import java.io.IOException;
import java.io.RandomAccessFile;

public class Week6a {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("NewFile1.txt", "rw");

            int ID = 3262;
            file.seek(0);
            file.writeBytes("ID=");
            file.writeInt(ID);
            file.seek(5);
            System.out.println("Reading Integer value: " + file.readInt());

            file.seek(file.length());
            file.writeBytes("\nName=VNR");
            file.seek(9);

            file.writeBytes("\nGender:");
            file.writeChar('M');
            file.seek(file.length() - 2);
            System.out.println("Reading Character value: " + file.readChar());

            file.writeBytes("\nNationality Indian?");
            file.writeBoolean(true);
            file.seek(file.length() - 1);
            System.out.println("Reading Boolean value: " + file.readBoolean());

            file.writeBytes("Weight=");
            long c = file.length();
            file.writeDouble(154.324);
            file.seek(c);
            System.out.println("Reading Double value: " + file.readDouble());

            file.close();
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}
