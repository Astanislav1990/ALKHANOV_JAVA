package ru.itpark.task;

/**
 * Created by Админ on 04.02.2019.
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

