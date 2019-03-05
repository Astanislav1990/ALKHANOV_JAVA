package ALKHANOV.repositories;

import ALKHANOV.list.ArrayList;
import ALKHANOV.list.List;
import ALKHANOV.models.Car;
import ALKHANOV.models.User;
import ALKHANOV.utils.IdGenerator;

import java.io.*;

public class CarsRepositoryImpl implements CarsRepository {

    private String fileNameCar;
    private IdGenerator idGenerator;

    public CarsRepositoryImpl(String fileNameCar, IdGenerator idGenerator) {
        this.fileNameCar = fileNameCar;
        this.idGenerator = idGenerator;
    }



    @Override
    public void save(Car model) {
        try {
            FileWriter fileWriter = new FileWriter(fileNameCar, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            int id = idGenerator.generateId();
            model.setId(id);
            writer.write(model.getId() + " " + model.getGosNumber() + " " + model.getModel() + " " + model.getOwnerId());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }



    @Override
    public Car find(int id) {
                try {
                    FileReader fileReader = new FileReader(fileNameCar);
                    BufferedReader reader = new BufferedReader(fileReader);
                    String currentLine = reader.readLine();
                    while (currentLine != null) {
                        String carData[] = currentLine.split(" ");
                        int currentId = Integer.parseInt(carData[0]);
                        if (currentId == id) {
                            Car car = new Car(carData[1], carData[2], Integer.parseInt(carData[3]));
                            car.setId(currentId);
                            return car;
                        }
                        currentLine = reader.readLine();
                    }
                    return null;
                } catch (IOException e) {
                    throw new IllegalArgumentException(e);
                }
            }

    @Override
    public List<Car> findByOwner(User owner) {
        try {
            FileReader fileReader = new FileReader(fileNameCar);
            BufferedReader reader = new BufferedReader(fileReader);
            List carList = new ArrayList();
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String s1 [] = currentLine.split(" ");
                if (s1[3].equals(String.valueOf(owner.getId()))){
                    Car car = new Car(s1[1],s1[2], Integer.parseInt(s1[3]));
                    carList.add(car);
                }
                currentLine = reader.readLine();
            }
            return carList;

        }catch (IOException e) {
            throw  new IllegalArgumentException(e);
        }

    }
}
