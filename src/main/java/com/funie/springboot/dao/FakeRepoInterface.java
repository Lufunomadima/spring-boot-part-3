package com.funie.springboot.dao;

import com.funie.springboot.model.User;

public interface FakeRepoInterface  {
    // add user
    void insertUser(long id, String name, String surname);

    // find a user
    User findById(long id);

    // delete a user
    int deleteUser(long id);
}
