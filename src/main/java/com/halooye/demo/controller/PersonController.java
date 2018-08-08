package com.halooye.demo.controller;

import com.halooye.demo.exception.NoPersonException;
import com.halooye.demo.model.Person;
import com.halooye.demo.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    private final static Logger logger = LoggerFactory.getLogger(Person.class);

    @RequestMapping("/api/demo/{id}")
    public String selectPerson(@PathVariable Integer id) throws Exception {
        Person person = personService.selectPerson(id);
        if(person==null) {
            logger.error("查询空指针异常");
            throw new NoPersonException("查询结果为空");
        }
        return personService.selectPerson(id).toString();
    }
}
