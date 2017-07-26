package org.rxjy.book.vo;

/**
 * 各个数据库对象的父类
 * 
 * @author huangxingbo
 * @version  1.0
 */
public class ValueObject {

	//ID字段,对应数据库中的ID列
	private String ID;

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
	}
	
	public void print(){
	  System.out.println("父类方法-print");  
	}
	
}
