package org.rxjy.book.vo;

/**
 * �������ݿ����ĸ���
 * 
 * @author huangxingbo
 * @version  1.0
 */
public class ValueObject {

	//ID�ֶ�,��Ӧ���ݿ��е�ID��
	private String ID;

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
	}
	
	public void print(){
	  System.out.println("���෽��-print");  
	}
	
}
