package ALKHANOV.utils;

import ALKHANOV.models.Car;

import java.util.Scanner;

public class CarsFromConsoleRetriever {
    private Scanner scanner;

    public CarsFromConsoleRetriever() {
        this.scanner = new Scanner(System.in);
    }

    public Car retrieveCar() {
        String gosNumber = scanner.nextLine();
        String model = scanner.nextLine();
        int ownerId = scanner.nextInt();

        return  new Car(gosNumber, model,ownerId);
    }
}

