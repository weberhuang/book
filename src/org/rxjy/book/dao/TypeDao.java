package org.rxjy.book.dao;

import java.util.Collection;

import org.rxjy.book.vo.Type;

/**
 * �鱾����DAO�ӿ�
 * 
 * @author huangxingbo
 * @version  1.0
 *  */

public interface TypeDao {

	/**
	 * �������е�����
	 * @return ����ļ���
	 */
	Collection<Type> find();
	
	/**
	 * ��������ģ����������
	 * @param name ��������
	 * @return
	 */
	Collection<Type> findByName(String name);
	
	/**
	 * ����id��������
	 * @param id ����id
	 * @return �����ֵ����
	 */
	Type find(String id);
	
	/**
	 * ���һ������
	 * @param type ��Ҫ��ӵ�����
	 */
	String add(Type type);
	
	/**
	 * �޸�һ������
	 * @param type �޸ĵ�����
	 */
	String update(Type type);
	
}
