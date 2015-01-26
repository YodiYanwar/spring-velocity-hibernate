package com.yodiyanwar.controller;

import com.yodiyanwar.entity.Person;
import com.yodiyanwar.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Yodi Yanwar
 */
@Controller
public class PersonFormController {
    
    @Autowired
    PersonService personService;
    
    @RequestMapping(value = {"/addPerson", "/edit"},method = RequestMethod.GET)
    public ModelMap displayForm(@RequestParam(value="id", required=false)Integer id){
        Person person;
        if(id == null){
            person = new Person();
        } else{
            person = personService.getPersonById(id);
        }

        return new ModelMap(person);
    }
    
    @RequestMapping(value = "/addPerson", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute Person person){
        
        personService.add(person);
        return "redirect:listPerson";
    }    
}
