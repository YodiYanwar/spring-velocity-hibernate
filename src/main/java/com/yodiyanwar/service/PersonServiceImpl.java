package com.yodiyanwar.service;

import com.yodiyanwar.dao.PersonDao;
import com.yodiyanwar.entity.Person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yodi Yanwar
 */
@Service
@Transactional
public class PersonServiceImpl implements PersonService {
    
    @Autowired
    private PersonDao personDao;
    
    public Person getPersonById(Integer id){
        return personDao.getPerson(id);
    }
    
    public List<Person> getAll(){
        return personDao.getAll();
    }
    
    public void add(Person person){
        personDao.addPerson(person);
    }
    
    public void delete(Integer id){
        personDao.deletePerson(id);
    }
    
    public void edit(Person person){
        personDao.editPerson(person);
    }
}
