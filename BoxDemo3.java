class Box {
  double height,width,depth;
  
  double volume() {
    return height*width*depth;
  } 
  
  void setValues(double h,double w,double d) {
    height = h;
    width = w;
    depth = d;
  }
}

class BoxDemo3 {
  public static void main(String args[]) {
    Box b1 = new Box();
    Box b2 = new Box();
    b1.setValues(10,20,30);
    b2.setValues(40,50,60);
    System.out.println("Volume of b1 is:"+b1.volume());
    System.out.println("Volume of b2 is:"+b2.volume());
  }
}