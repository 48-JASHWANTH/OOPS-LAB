import java.util.Scanner;

class MatrixMul {
  public static void main(String args[]) {
    int [][] a = new int[3][3];
    int [][] b = new int[3][3];
    int [][] c = new int[3][3];
    Scanner s = new Scanner(System.in);

    System.out.println("Enter values for 1st matrix:");
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
	a[i][j] = s.nextInt();
      }
    }

    System.out.println("Enter values for 2nd matrix:");
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
	b[i][j] = s.nextInt();	q
      }
    }
    
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
	c[i][j] = 0;
        for(int k=0;k<3;k++){
          c[i][j] += a[i][k] * b[k][j];
        }
      }
    }

   System.out.println("The resultant matrix is:");
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
	System.out.print(c[i][j]+" ");
      }
      System.out.println();
    }
  } 
}