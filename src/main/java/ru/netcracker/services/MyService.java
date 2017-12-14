package ru.netcracker.services;

import java.util.List;

public interface MyService<T> {
    void delete(T obj);
    void insert(T obj);
    void update(T obj);
    List<T> getAll();
}
