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
      double root1 = (-b+(Math.sqrt((b*b)-(4*a*c))))/2*a;
      double root2 = (-b-(Math.sqrt((b*b)-(4*a*c))))/2*a;
      System.out.println(root1);
      System.out.println(root2);
    }
    else if(d==0){
      System.out.println("The roots are real & equal");
      float root3 = -b/(2*a);
      System.out.println(root3);
    }
    else{
      System.out.println("The roots are imaginary");
    }
  }
}
