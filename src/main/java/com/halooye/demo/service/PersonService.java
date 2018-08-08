package com.halooye.demo.service;

import com.halooye.demo.mapper.PersonMapper;
import com.halooye.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonMapper personMapper;

    public Person selectPerson(Integer id) {
        return personMapper.selectPerson(id);
    }
}
