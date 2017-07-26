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
 * 主界面的JFrame
 * 
 * @author huangxingbo
 * @version  1.0
 *  */
public class MainFrame1 extends JFrame{
	
	
	
	ConcernPanel ConcernPanel;
		
	CommonPanel currentJPanel;
	
	//业务接口
	
	
	ConcernService ConcernService;

	
	private Action Concern = new AbstractAction("出版社管理", new ImageIcon("images/concern.gif")) {
		public void actionPerformed(ActionEvent e) {
			changePanel(ConcernPanel);
		}
	};
	
	public MainFrame1() {
		
		ConcernDao ConcernDao = new ConcernDaoImpl();
	
		this.ConcernService = new ConcernServiceImpl(ConcernDao);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("系统");
		menuBar.add(menu);
		
	
		menu.add(Concern).setAccelerator(KeyStroke.getKeyStroke('T', InputEvent.CTRL_MASK));
		
		//让界面作为第一显示界面
		this.ConcernPanel = new ConcernPanel(this.ConcernService);
		this.add(ConcernPanel);
//		this.currentPanel = ConcernPanel;
		//初始化销售界面的数据
		this.ConcernPanel.initData();

	
		
		this.setJMenuBar(menuBar);
		this.setTitle("图书进存销管理系统");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
	}
	
	  //切换各个界面
	    private void changePanel(CommonPanel commonJPanel) {
		//移除当前显示的JPanel
		this.remove(currentJPanel);
		//添加需要显示的JPanel
		this.add(commonJPanel);
		//设置当前的JPanel
		this.currentJPanel = commonJPanel;
		this.repaint();
		this.setVisible(true);
		//重新读取数据
		commonJPanel.setViewDatas();
		//刷新列表
		commonJPanel.clear();
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
