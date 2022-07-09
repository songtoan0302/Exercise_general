import oop.model.Bicycle;
import oop.model.Car;
import oop.model.Vehicle;
import oop.service.RunService;
import oop.service.impl.BicycleService;
import oop.service.impl.CarService;

public class MainApplication {

  public static void main(String[] args) {
    Vehicle vehicle1 = new Car("vehicle1", "x", true, 4);
    Vehicle vehicle2 = new Bicycle("vehicle2", "y", false, 2);
    Car car = new Car("Honda", "z", true, 4);
    Bicycle bicycle = new Bicycle("Thong nhat", "t", false, 2);

    System.out.println(vehicle1.toString());
    System.out.println(vehicle2.toString());
    System.out.println(car.toString());
    System.out.println(bicycle.toString());

    RunService runService1=new CarService();
    runService1.run();
    RunService runService2=new BicycleService();
    runService2.run();
  }

}
