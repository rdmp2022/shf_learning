package com.walker.dao;

import com.walker.entity.Role;
import java.util.List;

public interface RoleDao {


    List<Role> findAll();

    Integer insert(Role role);

}