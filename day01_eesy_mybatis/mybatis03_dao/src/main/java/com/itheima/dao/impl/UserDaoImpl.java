package com.itheima.dao.impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao{

    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    public List<User> findAll() {
        //1.使用工厂,创建SqlSession对象
        SqlSession session = factory.openSession();
        //2.使用session执行查询所有方法
        List<User> users = session.selectList("com.itheima.dao.IUserDao.findAll");
        session.close();
        //3返回查询结果
        return users;
    }
}
