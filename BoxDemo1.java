class Box {
  double height,width,depth;
  
  void volume(){
    double vol = height*width*depth;
    System.out.println("volume is:"+vol);
  }
}

class BoxDemo1 {
  public static void main(String args[]) {
    Box b1 = new Box();
    b1.height = 10;
    b1.width = 20;
    b1.depth = 30;
    b1.volume();    
  }
}