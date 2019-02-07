package ALKHANOV;

/**
 * Created by Админ on 07.02.2019.
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
            if (places[i].getNumberID() == null) {
                this.places[i].setTransport(transport);
                this.places[i].setNumberID(transport.getRegnumber());
                return;
            }
        }
        System.err.println("Нет мест");
    }

    public void UnPark(String Regnumber) {
        for (int i = 0; i < PLACES_COUNT; i++) {
            if (places[ i ].getNumberID() != null && places[ i ].getTransport() != null && places[i].getNumberID().equals(Regnumber) ) {
                places[i].setNumberID(null);
                places[i].setTransport(null);
                return;
            }

        }
        System.err.println("Такого ТС нет");
    }


}
