package com.ht.view;

import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MainPage extends JFrame{
	/**
	 * 
	 */
	private JMenuBar menuBar;
	private JPanel navigation; // login page
	private JPanel content; // welcome(login) and examples
	private JPanel footer; // version

	private static final long serialVersionUID = 1L;

	public MainPage(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		Toolkit tk = Toolkit.getDefaultToolkit();
		this.setSize(tk.getScreenSize());
		this.setVisible(true);
	}

	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
		this.setJMenuBar(menuBar);
	}

	public void setNavigation(JPanel navigation) {
		this.navigation = navigation;
	}

	public void setContent(JPanel content) {
		this.content = content;
	}

	public void setFooter(JPanel footer) {
		this.footer = footer;
	}
	
	
}
