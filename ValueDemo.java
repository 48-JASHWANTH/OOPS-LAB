class ByValue {
  void example(int x,int y) {
    x++;
    y++;
  }
}

class ValueDemo {
  public static void main(String args[]) {
    int a = 20;
    int b = 30;
    System.out.println("value of a before:"+a+"\nvalue of b before:"+b);
    ByValue temp = new ByValue();
    temp.example(a,b);
    System.out.println("value of a after:"+a+"\nvalue of b after:"+b);
  }
}