package com.cts.userinfo.service;

import com.cts.userinfo.dao.UserInfoDAO;
import com.cts.userinfo.vo.UserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService implements IUserInfoService {


    @Autowired
    UserInfoDAO dao;

    @Override
    public UserInfo createUserInfo(UserInfo userInfo) {
        return dao.createUser(userInfo);
    }

    @Override
    public List<UserInfo> readAllUsers() {
        return dao.readAllUsers();
    }

    @Override
    public UserInfo updateUserInfo(UserInfo customer) {
        return dao.updateUserInfo(customer);
    }

    @Override
    public boolean deleteUserInfo(long id) {
        return dao.deleteUser(id);
    }
}
