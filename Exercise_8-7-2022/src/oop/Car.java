package oop;

public class Car extends Vehicle{

  public Car() {
  }

  public Car(String vehicle1, String x, boolean b, int i) {
    super(vehicle1,x,b,i);
  }

  @Override
  public void run() {
    System.out.println("ô tô chạy động cơ xăng");
  }


}
