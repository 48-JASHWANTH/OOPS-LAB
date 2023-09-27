import java.util.Scanner;

class Roots {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter co-efficient for x^2(a):");
    int a = s.nextInt();
    System.out.print("Enter co-efficient for x(b):");
    int b = s.nextInt();
    System.out.print("Enter constant(c):");
    int c = s.nextInt();

    int d = (b*b)-(4*a*c);
    
    if(d>0){
      System.out.println("The roots are real & distinct");
    }
    else if(d==0){
      System.out.println("The roots are real & equal");
    }
    else{
      System.out.println("The roots are imaginary");
    }
  }
}