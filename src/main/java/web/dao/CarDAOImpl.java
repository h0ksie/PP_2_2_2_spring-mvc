package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private final List<Car> carList;

    public CarDAOImpl() {
        carList = Arrays.asList(
                new Car(1L, "Golf", 12L),
                new Car(2L, "Passat", 21L),
                new Car(3L, "Plaid", 32L),
                new Car(4L, "M", 43L),
                new Car(5L, "Axela", 54L));
    }

    @Override
    public List<Car> listCars() {
        return carList;
    }
}
