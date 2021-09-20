

class Main {
  public static void main(String[] args) {
    CartesianCalculator calculator = new CartesianCalculator(1,1,5,5);

    int x1 = 1;
    int x2 = 5;
    int y1 = 1;
    int y2 = 5;

    double x = x2 - x1;
    double y = y2 - y1;

    double length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

    System.out.println(Math.round(length));
    System.out.println(calculator.getLength());
  }
}
