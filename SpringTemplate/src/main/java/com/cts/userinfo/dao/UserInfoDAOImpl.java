package com.cts.userinfo.dao;

import com.cts.userinfo.vo.UserInfo;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository
public class UserInfoDAOImpl implements UserInfoDAO {

    public static final String TABLE_NAME = "UserInfo";
    Logger log = Logger.getLogger("UserInfoDAOImpl");

    @Override
    public UserInfo createUser(UserInfo userInfo) {
        return userInfo;
    }

    @Override
    public List<UserInfo> readAllUsers() {
        return null;
    }

    @Override
    public UserInfo updateUserInfo(UserInfo userInfo) {
        return userInfo;
    }

    @Override
    public boolean deleteUser(long id) {
        return false;
    }
}
