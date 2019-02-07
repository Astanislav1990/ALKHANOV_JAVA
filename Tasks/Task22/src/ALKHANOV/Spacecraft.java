package ALKHANOV;

/**
 * Created by Админ on 07.02.2019.
 */
public class Spacecraft extends Transport implements AirTransport, Shoot {

    public Spacecraft (String regnumber, int speed, String name){
        super(regnumber, speed, name);
    }
    @Override
    public void fly(){
        System.out.println( getName() + getSpeed() + "Закончил стрелять, лечу на парковку");
    }

    @Override
    public void shoot() {
        System.out.println( getName() + "Стой, а то буду стрелять");

    }
}

