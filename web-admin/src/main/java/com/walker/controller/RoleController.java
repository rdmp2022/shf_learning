package com.walker.controller;

import com.walker.entity.Role;
import com.walker.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value="/role")
@SuppressWarnings({"unchecked", "rawtypes"})
public class RoleController {

   @Autowired
   private RoleService roleService;


   private final static String PAGE_INDEX = "role/index.html";

   /** 
    * 列表
    * @param model
    * @return
    */
    @RequestMapping
   public String index(ModelMap model) {
      List<Role> list = roleService.findAll();

      model.addAttribute("list", list);
      return PAGE_INDEX;
   }

   private final static String PAGE_CREATE = "role/create";

   @GetMapping("/create")
   public String create() {
      return PAGE_CREATE;
   }

   private final static String PAGE_SUCCESS = "common/successPage";

   @PostMapping("/save")
   public String save(Role role, HttpServletRequest request) {
      roleService.insert(role);
      return PAGE_SUCCESS;
   }
}