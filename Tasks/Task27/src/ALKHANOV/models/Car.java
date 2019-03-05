package ALKHANOV.models;

public class Car {
    private int id;
    private String gosNumber;
    private String model;
    private int ownerId;




    public Car(String gosNumber, String model, int ownerId) {
        this.gosNumber = gosNumber;
        this.model = model;
        this.ownerId = ownerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getGosNumber() {
        return gosNumber;
    }

    public String getModel() {
        return model;
    }

    public int getOwnerId() {
        return ownerId;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", gosNumber='" + gosNumber + '\'' +
                ", model='" + model + '\'' +
                ", owner='" + ownerId + '\'' +
                '}';
    }
}
