package ALKHANOV;

/**
 * Created by Админ on 07.02.2019.
 */
public class Helicopter extends Transport implements AirTransport {
    public Helicopter (String regnumber, int speed, String name){
        super(regnumber, speed, name);
    }
    @Override
    public void fly(){
        System.out.println(getName() + getSpeed() + "Меня подбили, лечу на парковку");
    }
}
