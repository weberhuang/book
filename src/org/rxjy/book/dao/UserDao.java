package org.rxjy.book.dao;

import org.rxjy.book.vo.User;

/**
 * �û�DAO�ӿ�
 * 
 * @author huangxingbo
 * @version  1.0
 *  */

public interface UserDao {

	User getUser(String name, String password);
}
