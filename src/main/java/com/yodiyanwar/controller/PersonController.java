package com.yodiyanwar.controller;

import com.yodiyanwar.entity.Person;
import com.yodiyanwar.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Yodi Yanwar
 */
@Controller
public class PersonController {
    
    @Autowired
    PersonService personService;
    
    @RequestMapping(value = "/listPerson", method = RequestMethod.GET)
    public List<Person> getAllPerson(@ModelAttribute Person person){
        return personService.getAll();
    }
    
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editPerson(@ModelAttribute Person person){
        personService.edit(person);
        return "redirect:listPerson";
    }    
   
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deletePerson(@ModelAttribute Person person){
        
        personService.delete(person.getId());
        return "redirect:listPerson";
    }
    
}
