package com.funie.springboot.dao;

import com.funie.springboot.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;

import static java.lang.String.format;

public class FakeRepo implements FakeRepoInterface{
    private static final Logger LOGGER = LogManager.getLogger(FakeRepo.class.getName());

    ArrayList<User> users = new ArrayList<>();

    // add user
    @Override
    public void insertUser(long id, String name, String surname) {
        users.add(new User(id, name, surname));
        LOGGER.info(format("name : %s", name));
    }
    // find a user given an id
    @Override
    public User findById(long id) {
        for (User user : users) {
            if(user.getId() == id){
                LOGGER.info("User Found : " + user.getName());
                return user;
            }
        }
        LOGGER.error("User Not Found");
        return null;
    }
    // remove a user
    @Override
    public int deleteUser(long id) {
        users.removeIf(user -> user.getId() == id);
        return 0;
    }
    // print the 4
    // ,o,imuneybwvrCexwzq  user information
    @Override
    public String toString() {
        return "FakeRepo{" +
                "users=" + users +
                '}';
    }
}
