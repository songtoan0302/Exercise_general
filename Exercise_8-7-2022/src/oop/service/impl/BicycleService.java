package oop.service.impl;

import oop.service.RunService;

public class BicycleService implements RunService {

  @Override
  public void run() {
    System.out.println("Xe đạp chạy bằng 2 bánh");
  }
}
