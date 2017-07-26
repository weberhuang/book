package org.rxjy.book.dao.impl;

import java.sql.ResultSet;
import java.util.Collection;

import org.rxjy.book.commons.DataUtil;
import org.rxjy.book.jdbc.JDBCExecutor;
import org.rxjy.book.vo.ValueObject;

/**
 * ����DAO�Ļ���
 * 
 * @author huangxingbo
 * @version  1.0
 *  */


public class CommonDaoImpl {
	//����JDBCExecutor����
	public JDBCExecutor getJDBCExecutor() {
		return JDBCExecutor.getJDBCExecutor();
	}
	
	//���ݲ�����SQL, ��Ž���ļ��϶���, �;�������ݿ�ӳ����󷵻�һ������
	public Collection getDatas(String sql, Collection<ValueObject> result, 
			Class clazz) {
		//ִ��SQL����ResultSet����
		ResultSet rs = getJDBCExecutor().executeQuery(sql);
		//��ResultSet���з�װ�����ؼ���
		return DataUtil.getDatas(result, rs, clazz);
	}
}
