package ru.itpark.task;

/**
 * Created by Админ on 04.02.2019.
 */
public class Bicycle extends Transport implements GroundTransport {
    public Bicycle(String regnumber, int speed, String name) {
        super(regnumber, speed, name);
    }

    @Override
    public void go() {
        System.out.println(getName() + getSpeed() + "Опаздываю, вот бы место было свободно");

    }
}

