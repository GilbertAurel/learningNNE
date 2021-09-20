

class Main {
  public static void main(String[] args) {
    CartesianCalculator calculator = new CartesianCalculator(1,1,5,5);

    double result = Math.round(calculator.getLength());

    System.out.println(result);
  }
}
