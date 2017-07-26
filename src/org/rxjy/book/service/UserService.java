package org.rxjy.book.service;

/**
 * 用户业务接口
 * 
 * @author huangxingbo
 * @version  1.0
 *  */

public interface UserService {

	/**
	 * 用户登录的方法, 如果登录失败，则抛出BusinessException
	 * @param name
	 * @param password
	 */
	void login(String name, String password);
}
