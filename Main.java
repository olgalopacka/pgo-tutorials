//public class Main {

 // public static void main(String[] args) {
//    Telephone telephone1 = new Telephone("Iphone", 125, 888777666);
//   Telephone telephone2 = new Telephone("Samsung", 13, 999888666);
// System.out.println(telephone1.sendMessage("Hi",telephone2.number));
// } }

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args)
  {
    Car car1 = new Car("black","kia", 1.5);
    Car car2 = new Car("red", "audi", 2.2);

    System.out.println("car1 is " + car1.getColour() + " and " + car1.getBrand());
    System.out.println("car2 is " + car2.getColour() + " and " + car2.getBrand());

    car1.setEngineCapacity(1.5);
    car1.isEngineHighSpeed();
    car2.isEngineHighSpeed();
  }
}