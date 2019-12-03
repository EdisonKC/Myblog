package com.edison.myblog.service.user.impl;


import com.edison.myblog.dao.UserDao;
import com.edison.myblog.model.UserDomain;
import com.edison.myblog.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户相关Service接口实现
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;//这里会报错，但是并不影响


    @Override
    public UserDomain login(String username, String password) {
        UserDomain user = userDao.getUserInfoByCond(username,password);
        return user;
    }

    @Override
    public UserDomain getUserInfoById(Integer uid) {
        return null;
    }

    @Override
    public int updateUserInfo(UserDomain user) {
        return 0;
    }
}
