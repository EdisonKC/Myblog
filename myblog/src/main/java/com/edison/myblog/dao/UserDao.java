package com.edison.myblog.dao;

import com.edison.myblog.model.UserDomain;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    /**
     * 根据用户名密码获取用户信息
     * @param username  用户名
     * @param password  密码
     * @return
     */
    UserDomain getUserInfoByCond(@Param("username") String username, @Param("password") String password);
}
