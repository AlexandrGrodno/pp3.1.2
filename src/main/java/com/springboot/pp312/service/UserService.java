package com.springboot.pp312.service;




import com.springboot.pp312.model.User;

import java.util.List;

public interface UserService {

    public void save(User user);
    public void deleteUser(int id);
    public User getIdUser(int id);
    public List<User> allUser();


}
