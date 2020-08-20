package com.funie.springboot.service;

import com.funie.springboot.model.User;

public interface UserService {
    String addUser(long id, String name, String surname);
    int remove(long id);
    User getUser(long id);
}
