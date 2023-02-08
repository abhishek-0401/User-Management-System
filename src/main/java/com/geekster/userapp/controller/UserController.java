package com.geekster.userapp.controller;

import com.geekster.userapp.model.User;
import com.geekster.userapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user-app")
public class UserController {
    @Autowired
    public UserService userService;

//    http://localhost:8080/api/v1/user-app/getAllUser
    @GetMapping("/getAllUser")
        public List<User> getUsers(){
        return userService.getUsers();
        }

//    http://localhost:8080/api/v1/user-app/getUser/userid/1
    @GetMapping("getUser/userid/{userid}")
        public User getOneUser(@PathVariable int userid){
        return userService.getUserById(userid);
    }

//    http://localhost:8080/api/v1/user-app/addUser
    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
//    {
//        "id": 6,
//            "name": "Keshav",
//            "username": "keshu_veer",
//            "address": "Jamshedpur",
//            "phoneNumber": 9458765518
//    }


//    http://localhost:8080/api/v1/user-app/deleteUser/id/3
    @DeleteMapping("deleteUser/id/{id}")
    public void deleteTodo(@PathVariable int id) {
        userService.deleteUser(id);
    }
//    http://localhost:8080/api/v1/user-app/updateUserInfo/id/1
    @PutMapping("updateUserInfo/id/{id}")
    public void updateTodo(@PathVariable int id,@RequestBody User user) {
        userService.updateUserInfo(id,user);
    }
//    {
//        "id": 4,
//            "name": "Arti",
//            "username": "devi_arti",
//            "address": "Chandigarh",
//            "phoneNumber": 9784514784
//    }
}
