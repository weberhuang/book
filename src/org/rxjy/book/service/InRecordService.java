package org.rxjy.book.service;

import java.util.Collection;
import java.util.Date;

import org.rxjy.book.vo.InRecord;

/**
 * ����¼ҵ��ӿ�
 * 
 * @author huangxingbo
 * @version  1.0
 *  */
public interface InRecordService {

	/**
	 * ����һ������¼
	 * @param r
	 */
	void save(InRecord r);
	
	/**
	 * �������ڲ��Ҷ�Ӧ������¼
	 * @param date
	 * @return
	 */
	Collection<InRecord> getAll(Date date);
	
	/**
	 * ����id�������¼
	 * @param id
	 * @return
	 */
	InRecord get(String id);
}
