public class MainApplication {
  public static void main(String[] args) {
    Circle circle = new Circle();
    System.out.println("Ban kinh: " + circle.getRadius());
    System.out.println("Dien tích: " + circle.getArea());
    System.out.println("Chu vi: " + circle.getCircumference());
    System.out.println(circle.toString());
  }
}
