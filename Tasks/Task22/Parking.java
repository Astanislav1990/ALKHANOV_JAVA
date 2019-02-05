package ru.itpark.task;

/**
 * Created by Админ on 04.02.2019.
 */
public class Parking {
    private final int PLACES_COUNT = 10;
    private ParkingPlace places[];

    public Parking() {
        this.places = new ParkingPlace[PLACES_COUNT];
        for (int i = 0; i < places.length; i++) {
            this.places[i] = new ParkingPlace();
        }
    }

    public void Park(Transport transport) {
        for (int i = 0; i < PLACES_COUNT; i++) {
            if (places[i].getNumber() == null) {
                this.places[i].setTransport(transport);
                this.places[i].setNumber(transport.getRegnumber());
                return;
            }
        }
        System.err.println("Нет мест");
    }

    public void UnPark(String number) {
        for (int i = 0; i < PLACES_COUNT; i++) {
            if (places[i].getNumber().equals(number)) {
                places[i].setNumber(null);
                places[i].setTransport(null);
                return;
            }
        }
        System.err.println("Такой машины нет");
    }


}
