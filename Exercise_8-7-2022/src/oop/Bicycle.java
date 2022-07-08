package oop;


public class Bicycle extends Vehicle {

  public Bicycle() {

  }

  public Bicycle(String name, String typeVehicle, boolean engine, int wheel) {
    super(name, typeVehicle, engine, wheel);
  }

  @Override
  public void run() {
    System.out.println("xe đap chay bằng sức người đạp");
  }
}
