package ru.netcracker.Entity.mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.netcracker.Entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *  класс для отображения данных, полученных в результате запроса к бд
 */

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        return new User(resultSet.getString(User.LOGIN),resultSet.getString(User.PASSWORD),resultSet.getString(User.ROLE));
    }
}