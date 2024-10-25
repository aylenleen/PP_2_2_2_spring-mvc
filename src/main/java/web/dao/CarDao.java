package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> carList();
    public List<Car> getCars(int count);

}
