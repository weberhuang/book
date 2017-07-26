package org.rxjy.book.dao.impl;

import java.sql.ResultSet;
import java.util.Collection;

import org.rxjy.book.commons.DataUtil;
import org.rxjy.book.jdbc.JDBCExecutor;
import org.rxjy.book.vo.ValueObject;

/**
 * 各个DAO的基类
 * 
 * @author huangxingbo
 * @version  1.0
 *  */


public class CommonDaoImpl {
	//返回JDBCExecutor对象
	public JDBCExecutor getJDBCExecutor() {
		return JDBCExecutor.getJDBCExecutor();
	}
	
	//根据参数的SQL, 存放结果的集合对象, 和具体的数据库映射对象返回一个集合
	public Collection getDatas(String sql, Collection<ValueObject> result, 
			Class clazz) {
		//执行SQL返回ResultSet对象
		ResultSet rs = getJDBCExecutor().executeQuery(sql);
		//对ResultSet进行封装并返回集合
		return DataUtil.getDatas(result, rs, clazz);
	}
}
