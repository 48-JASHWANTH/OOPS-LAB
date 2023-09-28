class ByRef{
  int a,b;
  ByRef(int x,int y){
    a = x;
    b = y;
  }
  
  void example(ByRef ob) {
    ob.a++;
    ob.b++;
  }  
}

class RefDemo {
  public static void main(String args[]) {
    int a = 10;
    int b = 20;
    ByRef t = new ByRef(a,b);
    System.out.println("Before a:"+a+"Before b:"+b);
    t.example(t);
    System.out.println("After a:"+t.a+"After b:"+t.b); 
  }
}