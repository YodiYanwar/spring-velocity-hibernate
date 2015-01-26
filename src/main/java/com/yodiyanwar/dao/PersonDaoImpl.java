package com.yodiyanwar.dao;

import com.yodiyanwar.entity.Person;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yodi Yanwar
 */
@Repository
public class PersonDaoImpl implements PersonDao{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
    
    public void addPerson(Person person){
        getCurrentSession().save(person);
    }
    
    public void editPerson(Person person){
        Person personToEdit = getPerson(person.getId());
        personToEdit.setNama(person.getNama());
        personToEdit.setAlamat(person.getAlamat());
        personToEdit.setUmur(person.getUmur());
    }
    
    public void deletePerson(Integer id){
        Person person = getPerson(id);
        if(person != null){
            getCurrentSession().delete(person);
        }
    }
    
    public Person getPerson(Integer id){
        Person person = (Person) getCurrentSession().get(Person.class, id);
        return person;
    }
    
    public List<Person> getAll(){
        return getCurrentSession().createQuery("from Person").list();
    }  
    
}
