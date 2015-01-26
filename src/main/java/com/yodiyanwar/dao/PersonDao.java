package com.yodiyanwar.dao;

import com.yodiyanwar.entity.Person;
import java.util.List;

/**
 *
 * @author Yodi Yanwar
 */
public interface PersonDao {
    
    public void addPerson(Person person);
    public void editPerson(Person person);
    public void deletePerson(Integer id);
    public Person getPerson(Integer id);
    public List<Person> getAll();
    
}
