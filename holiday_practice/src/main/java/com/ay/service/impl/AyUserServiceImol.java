package com.ay.service.impl;

import com.ay.dao.AyUserDao;
import com.ay.model.AyUser;
import com.ay.service.AyUserService;

import javax.annotation.Resource;
import java.util.List;

public class AyUserServiceImol implements AyUserService {

    @Resource
    private AyUserDao ayUserDao;

    @Override
    public List<AyUser> findAll() {
        return ayUserDao.findAll();
    }
}
