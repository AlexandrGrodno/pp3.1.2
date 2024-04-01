package com.springboot.pp312.service;

import com.springboot.pp312.DAO.UserDAO;
import com.springboot.pp312.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private UserDAO userDAO;
    @Autowired
    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    public User getIdUser(int id) {
        return userDAO.getIdUser(id);
    }

    @Override
    public List<User> allUser() {
        return userDAO.allUser();
    }
}
