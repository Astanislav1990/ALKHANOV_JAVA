package ALKHANOV.list;

import ALKHANOV.models.Car;

public class ArrayList<T> implements List<T> {

    private T[] array;
    private final int size = 3;
    private int count;

    public ArrayList(){
        this.array = (T[])new Object[3];
        this.count = 0;
    }

    @Override
    public void add(T value) {
        array[count] = value;
        count++;
    }

}
