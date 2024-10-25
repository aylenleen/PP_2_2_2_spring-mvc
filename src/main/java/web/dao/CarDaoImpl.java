package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> carList() {
        List<Car> cars = new ArrayList<Car>();
        for (int i = 1; i < 6; i++) {
            Car car = new Car("model" + i, i, "color" + i);
            cars.add(car);
        }
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 5) {
            return carList().stream().limit(count).toList();
        } else {
            return carList().stream().limit(5).toList();
        }
    }
}
