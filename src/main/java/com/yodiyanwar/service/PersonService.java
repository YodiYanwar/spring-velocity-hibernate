package com.yodiyanwar.service;

import com.yodiyanwar.entity.Person;
import java.util.List;

/**
 *
 * @author Yodi Yanwar
 */
public interface PersonService {
    
    public Person getPersonById(Integer id);
    public List<Person> getAll();
    public void add(Person person);
    public void delete(Integer id);
    public void edit(Person person);
}
