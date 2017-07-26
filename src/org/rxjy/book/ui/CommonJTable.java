package org.rxjy.book.ui;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

/**
 * �б�Ļ���
 * 
 * @author huangxingbo
 * @version  1.0
 *  */
public class CommonJTable extends JTable {
    
	public CommonJTable(TableModel dm) {
		super(dm);
		//���ñ��ֻ��ѡ��һ��
		getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
	}
	//��д����ķ���, ʹ���еĵ�Ԫ�񲻿ɱ༭
	public boolean isCellEditable(int row, int column) {
		return false;
	}
}
