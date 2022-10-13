package com.walker.service.impl;

import com.walker.dao.RoleDao;
import com.walker.entity.Role;
import com.walker.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

   @Resource
   private RoleDao roleDao;

   public List<Role> findAll() {
      return roleDao.findAll();
   }

   @Override
   public Integer insert(Role role) {
      return roleDao.insert(role);
   }
}