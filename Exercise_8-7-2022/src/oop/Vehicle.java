package oop;

public abstract class Vehicle {
  private String name;
  private String typeVehicle;
  private boolean engine;
  private int wheel;

  public Vehicle() {}

  public Vehicle(String name, String typeVehicle, boolean engine, int wheel) {
    this.name = name;
    this.typeVehicle = typeVehicle;
    this.engine = engine;
    this.wheel = wheel;
  }

  public abstract void run();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTypeVehicle() {
    return typeVehicle;
  }

  public void setTypeVehicle(String typeVehicle) {
    this.typeVehicle = typeVehicle;
  }

  public boolean isEngine() {
    return engine;
  }

  public void setEngine(boolean engine) {
    this.engine = engine;
  }

  public int getWheel() {
    return wheel;
  }

  public void setWheel(int wheel) {
    this.wheel = wheel;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "name='" + name + '\'' +
        ", typeVehicle='" + typeVehicle + '\'' +
        ", engine=" + engine +
        ", wheel=" + wheel +
        '}';
  }
}
