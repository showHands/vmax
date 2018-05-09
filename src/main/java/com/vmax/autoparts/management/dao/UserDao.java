package com.vmax.autoparts.management.dao;

import com.vmax.autoparts.management.model.UserDomain;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}