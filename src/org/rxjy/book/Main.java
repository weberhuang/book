package org.rxjy.book;

import org.rxjy.book.dao.UserDao;
import org.rxjy.book.dao.impl.UserDaoImpl;
import org.rxjy.book.service.UserService;
import org.rxjy.book.service.impl.UserServiceImpl;
import org.rxjy.book.ui.LoginFrame;

/**
 * 程序入口类
 * 
 * @author huangxingbo
 * @version  1.0
 */
public class Main {
   

	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		LoginFrame loginFrame = new LoginFrame(userService);
	}

}
