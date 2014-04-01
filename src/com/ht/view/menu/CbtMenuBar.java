package com.ht.view.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CbtMenuBar extends JMenuBar {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//
	JMenu file;
	JMenuItem welcome;
	JMenuItem about;
	//
	JMenu help;
	
	public CbtMenuBar() {
		file = new JMenu("File");
		help = new JMenu("Help");
		this.add(file);
		this.add(help);
		setMenuItems();
	}
	private void setMenuItems(){
		// file menu
		
		// help menu
		welcome = new JMenuItem("Welcome");
		about = new JMenuItem("About this");
		help.add(welcome);
		help.add(about);
	}
}
