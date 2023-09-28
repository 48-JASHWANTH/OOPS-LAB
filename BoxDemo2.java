class Box {
  double height,width,depth;
  
  double volume(){
    return height*width*depth;
  }
  
  void setValue(){
    height = 10;
    width = 20;
    depth = 30;
  }
}

class BoxDemo2 {
  public static void main(String args[]) {
    Box b1 = new Box();
    Box b2 = new Box();
    b1.setValue();
    b2.setValue();
    System.out.println("Volume of b1 is:"+b1.volume());
    System.out.println("Volume of b2 is:"+b2.volume());
  }
}