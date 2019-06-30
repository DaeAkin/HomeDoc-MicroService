package com.homedoc.repository.resources;

import com.homedoc.repository.dto.MemberDto;
import com.homedoc.repository.service.BasicService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api("Default URI")
public abstract class BasicResource<T,ID,S extends BasicService> {

    S service;

    @RequestMapping(method = RequestMethod.POST)
    public void insert(@ModelAttribute T t) {
        service.insert(t);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public T getById(@PathVariable("userId") ID userId) {
        return (T)service.getById(userId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getAll")
    public List<T> getAll() {
        return service.getAll();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{userId}")
    public void update(@ModelAttribute T t,@PathVariable("userId") ID userId) {

        // can be revised.
        service.update(t);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/")
    public void deleteAll() {
        service.deleteAll();
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/{userId}")
    public void deleteById(@PathVariable("userId") ID userId) {
        service.deleteById(userId);
    }





}
