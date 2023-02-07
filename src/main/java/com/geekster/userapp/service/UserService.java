package com.geekster.userapp.service;

import com.geekster.userapp.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserService {
    private static List<User> users = new ArrayList<User>();
    private static int id = 0;

    static{
        User u1 = new User(++id,"Abhishek","abhi0401","Jammu",9415745621L);
        users.add(u1);
        User u2 = new User(++id,"Shivam","shiva22","Himachal",7885456210L);
        users.add(u2);
        User u3 = new User(++id,"Sahil","sahil871","Srinagar",6005745461L);
        users.add(u3);
        User u4 = new User(++id,"Arti","arti_devi","Rajbagh",9784514784L);
        users.add(u4);
        User u5 = new User(++id,"Sumit","sumo_112","Punjab",8716024532L);
        users.add(u5);
    }
    public List<User> getUsers(){
        return users;
    }
    public User getUserById(int userid) {
        for (User user : users) {
            if (user.getId() == userid) {
                return user;
            }
        }
        return null;
    }
    public void addUser(User user){
        users.add(user);
    }
    public void deleteUser(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        users.removeIf(predicate);
    }

    public void updateUserInfo(int id,User newUser) {
        User user=getUserById(id);
        user.setId(newUser.getId());
        user.setName(newUser.getName());
        user.setAddress(newUser.getAddress());
        user.setUsername(newUser.getUsername());
        user.setPhoneNumber(newUser.getPhoneNumber());
    }
}
