package org.rxjy.book.dao;

import java.util.Collection;

import org.rxjy.book.vo.InRecord;

/**
 * 入库记录DAO接口
 * 
 * @author huangxingbo
 * @version  1.0
 *  */

public interface InRecordDao {

	/**
	 * 根据日期区间查找入库记录
	 * @param begin 开始日期的字符串
	 * @param end 结束日期的字符
	 * @return
	 */
	Collection<InRecord> findByDate(String begin, String end);
	
	/**
	 * 根据入库记录id获得入库记录对象
	 * @param id
	 * @return
	 */
	InRecord findById(String id);
	
	/**
	 * 保存一个入库记录
	 * @param r
	 * @return
	 */
	String save(InRecord r);
}
