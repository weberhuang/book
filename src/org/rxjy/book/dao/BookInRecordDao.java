package org.rxjy.book.dao;

import java.util.Collection;

import org.rxjy.book.vo.BookInRecord;

/**
 * �鱾����¼DAO�ӿ�
 * 
 * @author huangxingbo
 * @version  1.0
 *  */


public interface BookInRecordDao {

	/**
	 * ��������¼����ȫ�����������¼
	 * @param inRecordId
	 * @return
	 */
	Collection<BookInRecord> findByInRecord(String inRecordId);
	
	/**
	 * ����һ���������¼, �����ظü�¼��id
	 * @param r
	 * @return
	 */
	String save(BookInRecord r);
}
