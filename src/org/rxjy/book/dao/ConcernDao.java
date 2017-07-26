package org.rxjy.book.dao;

import java.util.Collection;

import org.rxjy.book.vo.Concern;

/**
 * ������DAO�ӿ�
 * 
 * @author huangxingbo
 * @version  1.0
 *  */


public interface ConcernDao {

	/**
	 * ����ȫ���ĳ�����
	 * @return
	 */
	Collection<Concern> findAll();
	
	/**
	 * ����ID���ҳ�����
	 * @param id
	 * @return
	 */
	Concern find(String id);
	
	/**
	 * ���һ��������
	 * @param concern 
	 * @return
	 */
	String add(Concern concern);
	
	/**
	 * �޸�һ��������
	 * @param concern
	 * @return
	 */
	String update(Concern concern);
	
	/**
	 * ��������ģ�����ҳ�����
	 * @param name
	 * @return
	 */
	Collection<Concern> findByName(String name);
}
