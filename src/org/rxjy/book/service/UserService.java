package org.rxjy.book.service;

/**
 * �û�ҵ��ӿ�
 * 
 * @author huangxingbo
 * @version  1.0
 *  */

public interface UserService {

	/**
	 * �û���¼�ķ���, �����¼ʧ�ܣ����׳�BusinessException
	 * @param name
	 * @param password
	 */
	void login(String name, String password);
}
