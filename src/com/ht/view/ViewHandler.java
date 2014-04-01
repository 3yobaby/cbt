package com.ht.view;

import javax.swing.JFrame;

import com.ht.view.menu.CbtMenuBar;

public class ViewHandler {
	public static void main(String[] args) {
		new ViewHandler();
	}
	private JFrame mainPage;
	public ViewHandler() {
		mainPage = new MainPage("Computer Test Programe");
		mainPage.setJMenuBar(new CbtMenuBar());
	}
}
