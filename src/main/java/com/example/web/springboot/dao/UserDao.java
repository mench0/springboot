package com.example.web.springboot.dao;


import com.example.web.springboot.model.Role;
import com.example.web.springboot.model.User;

import java.util.List;

public interface UserDao {
    User getByName(String name);
    void save(User user);
    User getById(Long id);
    void update(User user);
    void delete(Long id);
    List<User> getAll();
    Role getRole(String name);
    List<Role> getAllRoles();
}
