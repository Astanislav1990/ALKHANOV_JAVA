package ru.itpark.task;

/**
 * Created by Админ on 04.02.2019.
 */
public class Airplane extends Transport implements AirTransport {
    public Airplane (String regnumber, int speed, String name){
        super(regnumber, speed, name);
    }
    @Override
    public void fly(){
        System.out.println(getName() + getSpeed() + "Наш экипаж готов к посадке, просьба убедитесь, что ремни пристегнуты");
    }

}
