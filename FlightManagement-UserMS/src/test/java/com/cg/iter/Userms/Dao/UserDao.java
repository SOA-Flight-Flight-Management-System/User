package com.cg.iter.Userms.Dao;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserDao{
    public abstract void addUser(User user);
    public abstract Optional<User> viewUserById(int userId);
    public abstract List<User> viewAllUser();
    public abstract void updateUser(User user);
    public abstract void deleteUser(int userId);

}
