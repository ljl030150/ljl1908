package com.bjpowernode.crm.settings.service.impl;

import com.bjpowernode.crm.settings.dao.UserDao;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.utils.SqlSessionUtil;

/**
 *
 */
public class UserServiceImpl implements UserService {
    private UserDao dao= SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
}
