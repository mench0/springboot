package com.example.web.springboot.service;


import com.example.web.springboot.model.Role;
import com.example.web.springboot.model.User;

import java.util.List;

public interface UserService {
    User getUserByName(String name);
    void saveUser(User user);
    User getUserById(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
    List<User> getAllUsers();
    Role getRole(String name);
    List<Role> getAllRoles();
}
