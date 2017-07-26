package org.rxjy.book.dao;

import java.util.Collection;

import org.rxjy.book.vo.BookSaleRecord;

/**
 * �鱾���ۼ�¼DAO�ӿ�
 * 
 * @author huangxingbo
 * @version  1.0
 *  */


public interface BookSaleRecordDao {

	/**
	 * �������ۼ�¼id��ȡ�����ۼ�¼�����е�������ۼ�¼
	 * @param saleRecordId
	 * @return
	 */
	Collection<BookSaleRecord> findBySaleRecord(String saleRecordId);

	/**
	 * ����һ��������ۼ�¼
	 * @param record
	 * @return
	 */
	String saveBookSaleRecord(BookSaleRecord record);
	
}
