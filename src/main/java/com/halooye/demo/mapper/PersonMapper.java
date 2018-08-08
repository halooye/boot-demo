package com.halooye.demo.mapper;

import com.halooye.demo.model.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper {
    @Select("SELECT * FROM admin_user WHERE id = #{id}")
    Person selectPerson(Integer id);
}
