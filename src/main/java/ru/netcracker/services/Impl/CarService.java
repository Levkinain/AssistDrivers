package ru.netcracker.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netcracker.Entity.Car;
import ru.netcracker.dao.Impl.CarDao;
import ru.netcracker.services.MyService;

import java.util.List;

@Service
public class CarService implements MyService<Car> {
    private CarDao carDao;

    @Autowired
    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void delete(Car obj) {
        carDao.delete(obj);
    }

    @Override
    public void insert(Car obj) {
        carDao.insert(obj);
    }

    @Override
    public void update(Car obj) {
        carDao.update(obj);
    }

    @Override
    public List<Car> getAll() {
        return carDao.getAll();
    }
}
