package ru.netcracker.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.netcracker.Entity.Car;
import ru.netcracker.Entity.User;
import ru.netcracker.Entity.mappers.CarMapper;
import ru.netcracker.Entity.mappers.UserMapper;
import ru.netcracker.dao.Dao;

import java.util.List;

public class UserDao implements Dao<User> {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void delete(User obj) {
        String sql = "Delete  from  public.users  where public.users.login = ?";
        jdbcTemplate.update(sql,obj.getLogin());
    }

    @Override
    public void insert(User obj) {
        String sql = " INSERT into  public.users VALUES (?,?,?)";
        jdbcTemplate.update(sql,obj.getLogin(),obj.getPassword(),obj.getRole());
    }

    @Override
    public void update(User obj) {
      /* " UPDATE public.cars SET
        String sql = " INSERT into  public.cars VALUES (DEFAULT ,?,?,?);";
        jdbcTemplate.update(sql,obj.getModel(),obj.getColor(),obj.getNumberAuto());*/
    }
    @Override
    public List<User> getAll() {
        String sql =  "SELECT * FROM  public.cars";
        return jdbcTemplate.query(sql, new UserMapper());
    }




}
