class Box {
  double height,width,depth;

  Box() {
    height = 10;
    width = 20;
    depth = 30;
  }
  
  double volume() {
    return height*width*depth;
  }
}

class BoxDemo4 {
  public static void main(String args[]) {
   Box b1 = new Box();
   Box b2 = new Box();
   System.out.println("Volume of b1 is:"+b1.volume());
   System.out.println("Volume of b2 is:"+b2.volume());
  }
}