package org.rxjy.book.ui;

import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;

import org.rxjy.book.dao.ConcernDao;
import org.rxjy.book.dao.impl.ConcernDaoImpl;
import org.rxjy.book.service.ConcernService;
import org.rxjy.book.service.impl.ConcernServiceImpl;

/**
 * �������JFrame
 * 
 * @author huangxingbo
 * @version  1.0
 *  */
public class MainFrame1 extends JFrame{
	
	
	
	ConcernPanel ConcernPanel;
		
	CommonPanel currentJPanel;
	
	//ҵ��ӿ�
	
	
	ConcernService ConcernService;

	
	private Action Concern = new AbstractAction("���������", new ImageIcon("images/concern.gif")) {
		public void actionPerformed(ActionEvent e) {
			changePanel(ConcernPanel);
		}
	};
	
	public MainFrame1() {
		
		ConcernDao ConcernDao = new ConcernDaoImpl();
	
		this.ConcernService = new ConcernServiceImpl(ConcernDao);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("ϵͳ");
		menuBar.add(menu);
		
	
		menu.add(Concern).setAccelerator(KeyStroke.getKeyStroke('T', InputEvent.CTRL_MASK));
		
		//�ý�����Ϊ��һ��ʾ����
		this.ConcernPanel = new ConcernPanel(this.ConcernService);
		this.add(ConcernPanel);
//		this.currentPanel = ConcernPanel;
		//��ʼ�����۽��������
		this.ConcernPanel.initData();

	
		
		this.setJMenuBar(menuBar);
		this.setTitle("ͼ�����������ϵͳ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
	}
	
	  //�л���������
	    private void changePanel(CommonPanel commonJPanel) {
		//�Ƴ���ǰ��ʾ��JPanel
		this.remove(currentJPanel);
		//�����Ҫ��ʾ��JPanel
		this.add(commonJPanel);
		//���õ�ǰ��JPanel
		this.currentJPanel = commonJPanel;
		this.repaint();
		this.setVisible(true);
		//���¶�ȡ����
		commonJPanel.setViewDatas();
		//ˢ���б�
		commonJPanel.clear();
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
