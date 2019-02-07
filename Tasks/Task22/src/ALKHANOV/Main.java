package ALKHANOV;

/**
 * Created by Админ on 07.02.2019.
 */
public class Main {
    public static void main(String[] args) {

        Parking parking = new Parking();
        Car car = new Car("777", 150, "Калина");
        Tank tank = new Tank("156", 120, "БТР");
        Bicycle bicycle = new Bicycle("17", 40, "Урал");
        Airplane airplane = new Airplane("397", 800, "Боинг");
        Spacecraft spacecraft = new Spacecraft("404142", 1500, "Белая База");
        Helicopter helicopter = new Helicopter("456987", 980, "Черная Акула");

        GroundTransport groundTransports[] = {car, tank, bicycle};
        AirTransport airTransports[] = {airplane, spacecraft, helicopter};
        Shoot shoots[] = {tank, spacecraft};


        car.park(parking);
        car.park(parking);
        car.park(parking);
        car.park(parking);
        car.park(parking);
        car.park(parking);
        car.park(parking);
        car.park(parking);
        car.park(parking);
        car.park(parking);

        tank.unpark(parking);





    }
}
