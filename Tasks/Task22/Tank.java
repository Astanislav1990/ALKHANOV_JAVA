package ru.itpark.task;

/**
 * Created by Админ on 04.02.2019.
 */
public class Tank extends Transport implements GroundTransport, Shoot {
    public Tank(String regnumber, int speed, String name){
        super(regnumber, speed, name);
    }

    @Override
    public void go() {
        System.out.println(getName() + getSpeed() + "Срочно нужно запарковаться, выезжаю");
    }

    @Override
    public void shoot() {
        System.out.println(getName()+ "Прямо в десятку");

    }
}
