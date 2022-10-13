package com.walker.service;


import com.walker.entity.Role;

import java.util.List;

public interface RoleService {

    List<Role> findAll();

    Integer insert(Role role);
}