package ALKHANOV.repositories;

import ALKHANOV.list.List;
import ALKHANOV.models.Car;
import ALKHANOV.models.User;

public interface CarsRepository extends CrudRepository<Car> {
List<Car> findByOwner(User owner);


}
