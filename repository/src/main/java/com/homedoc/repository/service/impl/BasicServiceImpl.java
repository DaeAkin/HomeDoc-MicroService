package com.homedoc.repository.service.impl;

import java.util.List;

import com.homedoc.repository.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;


public abstract class BasicServiceImpl<T,ID,R extends MongoRepository<T, ID>
        >implements BasicService<T,ID> {

    @Autowired
    R repository;

    public void insert(T t) {
        repository.insert(t);
    }

    public T getById(ID id ) {
        return (T)repository.findById(id);
    }

    public List<T> getAll() {
        return repository.findAll();
    }

    public void update(T t) {
        repository.save(t);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }


}
