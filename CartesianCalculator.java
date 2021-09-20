public class CartesianCalculator {
  int x1;
  int y1;
  int x2;
  int y2;

  public CartesianCalculator(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public double getLength(){
    double x = x2 - x1;
    double y = y2 - y1;

    double length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    return length;
  }
}