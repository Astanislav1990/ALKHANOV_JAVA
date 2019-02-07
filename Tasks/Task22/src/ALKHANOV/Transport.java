package ALKHANOV;

/**
 * Created by Админ on 07.02.2019.
*/
public abstract class  Transport {
    private String regnumber;
    private int speed;
    private String name;

    public Transport(String regnumber, int speed, String name) {
        this.regnumber = regnumber;
        this.speed = speed;
        this.name = name;
    }

    public String getRegnumber() {
        return regnumber;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    void park (Parking parking){
        parking.Park(this);
    }
    void unpark (Parking parking) {
        parking.UnPark(this.getRegnumber());
    }


}

