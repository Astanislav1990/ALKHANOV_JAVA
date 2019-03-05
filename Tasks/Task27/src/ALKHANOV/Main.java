package ALKHANOV;

import ALKHANOV.models.Car;
import ALKHANOV.models.User;
import ALKHANOV.repositories.CarsRepository;
import ALKHANOV.repositories.CarsRepositoryImpl;
import ALKHANOV.repositories.UsersRepository;
import ALKHANOV.repositories.UsersRepositoryImpl;
import ALKHANOV.utils.CarsFromConsoleRetriever;
import ALKHANOV.utils.IdGenerator;
import ALKHANOV.utils.UserFromConsoleRetriever;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserFromConsoleRetriever retriever = new UserFromConsoleRetriever();
        IdGenerator idGenerator = new IdGenerator("users_id_sequence.txt");
        UsersRepository usersRepository = new UsersRepositoryImpl("users.txt", idGenerator);

        CarsFromConsoleRetriever retriever1 = new CarsFromConsoleRetriever();
        IdGenerator idGenerator1 = new IdGenerator("cars_id_sequence.txt");
        CarsRepository carsRepository = new CarsRepositoryImpl("cars.txt", idGenerator1);

//        User user = retriever.retrieveUser();
//        usersRepository.save(user);
//
//     System.out.println(usersRepository.find(0));
//     System.out.println(usersRepository.find(1));
//     System.out.println(usersRepository.find(2));


       Car car = retriever1.retrieveCar();
       carsRepository.save(car);

      System.out.println(carsRepository.find(1));
      System.out.println(carsRepository.find(2));
     System.out.println(carsRepository.find(8));







    }
}
