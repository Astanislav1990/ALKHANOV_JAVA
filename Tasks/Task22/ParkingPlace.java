package ru.itpark.task;

/**
 * Created by Админ on 04.02.2019.
 */
public class ParkingPlace {
    private Transport transport;
    private String number;

    public Transport getTransport() {
        return transport;
    }

    public String getNumber() {
        return number;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
