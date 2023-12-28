import java.io.*;
import java.util.Date;

class Emp implements Serializable {
    String na;
    Date dob;
    String dept;
    String desi;
    double sal;

    Emp() {
    }

    Emp(String na, Date dob, String dept, String desi, double sal) {
        this.na = na;
        this.dob = dob;
        this.dept = dept;
        this.desi = desi;
        this.sal = sal;
    }
    static void seEmp(Emp emp) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data"))) {
            os.writeObject(emp);
            System.out.println("Object has been serialized and saved to 'data'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Emp deEmp() {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("data"))) {
            return (Emp) is.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void display() {
        System.out.println("Name: " + na);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Department: " + dept);
        System.out.println("Designation: " + desi);
        System.out.println("Salary: " + sal);
    }
}

public class Week6b{
    public static void main(String[] args) {
        Emp emp = new Emp("John Doe", new Date(), "IT", "Software Engineer", 75000.0);

        Emp.seEmp(emp);

        Emp deEmp = Emp.deEmp();

        if (deEmp != null) {
            System.out.println("Deserialized Employee Object:");
            deEmp.display();
        }
    }
}

