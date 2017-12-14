package ru.netcracker.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.netcracker.Entity.Car;
import ru.netcracker.Entity.mappers.CarMapper;
import ru.netcracker.dao.Dao;

import java.util.List;

@Repository
public class CarDao implements Dao<Car> {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CarDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void delete(Car obj) {
        String sql = "Delete  from  public.cars  where public.cars.numberauto = ?";
        jdbcTemplate.update(sql,obj.getNumberAuto());
    }

    @Override
    public void insert(Car obj) {
        String sql = " INSERT into  public.cars VALUES (DEFAULT ,?,?,?)";
        jdbcTemplate.update(sql,obj.getModel(),obj.getColor(),obj.getNumberAuto());
    }

    @Override
    public void update(Car obj) {
      /* " UPDATE public.cars SET
        String sql = " INSERT into  public.cars VALUES (DEFAULT ,?,?,?);";
        jdbcTemplate.update(sql,obj.getModel(),obj.getColor(),obj.getNumberAuto());*/
    }

    @Override
    public List<Car> getAll() {
        String sql =  "SELECT * FROM  public.cars";
        List<Car> carList = jdbcTemplate.query(sql, new CarMapper());
        return carList;
    }
}
