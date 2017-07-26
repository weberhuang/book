package org.rxjy.book.dao;

import java.util.Collection;

import org.rxjy.book.vo.Book;

/**
 * �鱾DAO�ӿ�
 * 
 * @author huangxingbo
 * @version  1.0
 *  */


public interface BookDao {

	/**
	 * ����ȫ�����鱾
	 * @return
	 */
	Collection<Book> findAll();
	
	/**
	 * �����鱾ID��ȡ��
	 * @param id
	 * @return
	 */
	Book find(String id);
	
	/**
	 * ����һ����, ���������Ӻ����id
	 * @param book
	 * @return
	 */
	String add(Book book);
	
	/**
	 * �޸�һ����, �������id
	 * @param book
	 * @return
	 */
	String update(Book book);
	
	/**
	 * ����������ģ��������
	 * @param name
	 * @return
	 */
	Collection<Book> findByName(String name);
	
	/**
	 * �޸���Ŀ��
	 * @param b
	 */
	void updateRepertory(Book b);
	
}