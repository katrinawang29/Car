package com.fju;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        System.out.println("Welcome");
        int func = 0;
        while (func != 0) {
            System.out.println("1)Car enter");
            System.out.println("1)Car enter");
            System.out.println("1)Car enter");
            System.out.println("1)Car enter");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            func = Integer.parseInt(s);
            switch (func){
                case 1:
                    System.out.println("enter ID");
                    String id = scanner.nextLine();
                    Car c = new Car(id);
                    cars.add(c);
                    System.out.println("Car added");
                    break;
                case 2:

                case 3:
                    for (Car car : cars){
                        System.out.println(car.id + "/" + car.enter + "/" + car.leave);
                    }
                case 4:

            }
        }
    }
}
