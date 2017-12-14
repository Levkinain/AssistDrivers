package ru.netcracker.Entity.mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.netcracker.Entity.Car;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *  класс для отображения данных, полученных в результате запроса к бд
 */
public class CarMapper implements RowMapper<Car> {

    @Override
    public Car mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Car(resultSet.getString(Car.MODEL),resultSet.getString(Car.COLOR),resultSet.getString(Car.NUMBER_AUTO));
    }
}
