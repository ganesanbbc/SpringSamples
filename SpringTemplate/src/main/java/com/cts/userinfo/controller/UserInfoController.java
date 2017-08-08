package com.cts.userinfo.controller;


import com.cts.userinfo.service.UserInfoService;
import com.cts.userinfo.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserInfoController {

    public interface EndPoint {
        String ROOT = "/";
        String CREATE_USER = "createUser";
        String READ_USER = "readUser";
        String UPDATE_USER = "updateUser/{id}";
        String DELETE_USER = "deleteUser/{id}";
    }

    @Autowired
    UserInfoService service;


    @RequestMapping(value = EndPoint.CREATE_USER, method = RequestMethod.POST)
    public UserInfo createUser(@RequestBody UserInfo userInfo) {
        return service.createUserInfo(userInfo);
    }

    @RequestMapping(value = {EndPoint.ROOT, EndPoint.READ_USER}, method = RequestMethod.GET)
    public List<UserInfo> readUsers(Model model) {
        return service.readAllUsers();
    }

    @RequestMapping(value = EndPoint.UPDATE_USER, method = RequestMethod.POST)
    public UserInfo updateUser(@PathVariable long userId, @RequestBody UserInfo userInfo) {
        return service.updateUserInfo(userId,userInfo);
    }

    @RequestMapping(value = EndPoint.DELETE_USER, method = RequestMethod.GET)
    public boolean deleteUser(@PathVariable long userId) {
        return service.deleteUserInfo(userId);
    }
}
