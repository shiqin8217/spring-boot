package com.example.dao;

import com.example.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by shiqin_zhang on 2016-10-28 Time 12:08 PM
 */
@Repository
public interface UserDao {

    User getUser(String username);

}
