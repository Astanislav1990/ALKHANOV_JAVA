package ALKHANOV;

/**
 * Created by Админ on 07.02.2019.
 */
public class Car extends Transport implements GroundTransport {
    public Car(String regnumber, int speed, String name){
        super(regnumber, speed, name);
    }
    @Override
    public void go() {
        System.out.println( getName() + getSpeed() + "Я тут запаркуюсь");
    }
    void park (Parking parking){
        parking.Park(this);
    }
}
