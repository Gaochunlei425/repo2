package com.ay.dao;

import com.ay.model.AyUser;

import java.util.List;

public interface AyUserDao {
    List<AyUser> findAll();
}
