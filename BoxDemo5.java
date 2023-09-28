class Box {
  double height,width,depth;
  
  Box(double h,double w,double d) {
    height = h;
    width = w;
    depth = d;
  }

  double volume() {
    return height*width*depth;
  }
}

class BoxDemo5 {
  public static void main(String args[]) {
    Box b1 = new Box(10,20,30);
    Box b2 = new Box(40,50,60);
    System.out.println("Volume of b1 is:"+b1.volume());
    System.out.println("Volume of b2 is:"+b2.volume());
  }
}