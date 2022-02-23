package com.gcu.topic22.data;

import java.util.List;

public interface DataAccessInterface <T>{
    public List<T> findall();
    public T findById(int id);
    public boolean create(T t);
    public boolean update(T t);
    public boolean delete(T t);

}
