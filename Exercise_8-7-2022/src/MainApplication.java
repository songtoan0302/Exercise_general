import oop.Bicycle;
import oop.Car;
import oop.Vehicle;

public class MainApplication {

  public static void main(String[] args) {
    Vehicle vehicle1 = new Car("vehicle1", "x", true, 4);
    Vehicle vehicle2 = new Bicycle("vehicle2", "y", false, 2);
    Car car = new Car("Honda", "z", true, 4);
    Bicycle bicycle = new Bicycle("Thong nhat", "t", false, 2);

    System.out.println(vehicle1.toString());
    vehicle1.run();
    System.out.println(vehicle2.toString());
    vehicle2.run();
    System.out.println(car.toString());
    car.run();
    System.out.println(bicycle.toString());
    bicycle.run();
  }
}
