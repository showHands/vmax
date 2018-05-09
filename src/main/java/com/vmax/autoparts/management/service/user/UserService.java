package com.vmax.autoparts.management.service.user;


import com.vmax.autoparts.management.model.UserDomain;

import java.util.List;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

    int addUser(UserDomain user);

    List<UserDomain> findAllUser(int pageNum, int pageSize);
}
