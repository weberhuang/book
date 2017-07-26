package org.rxjy.book.service.impl;

import org.rxjy.book.commons.BusinessException;
import org.rxjy.book.dao.UserDao;
import org.rxjy.book.service.UserService;
import org.rxjy.book.vo.User;

/**
 * 用户业务实现类
 * 
 * @author huangxingbo
 * @version  1.0
 *  */
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void login(String name, String password) {
		User user = userDao.getUser(name, password);
		if (user == null) {
			throw new BusinessException("用户名密码错误");
		}
	}

}
