package oop.service.impl;

import oop.service.RunService;

public class CarService implements RunService {

  @Override
  public void run() {
    System.out.println("Xe ô tô chạy bằng 4 bánh");
  }
}
