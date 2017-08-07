package com.cts.userinfo.dao;

import com.cts.userinfo.vo.UserInfo;

import java.util.List;

public interface UserInfoDAO {
    UserInfo createUser(UserInfo userInfo);

    List<UserInfo> readAllUsers();

    UserInfo updateUserInfo(UserInfo userInfo);

    boolean deleteUser(long id);
}
