package com.peyton.othello.menus;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	//private OthelloGameHandler gameHandler = new OthelloGameHandler();
	//private Timer timer = new Timer();
	
	
	public GameWindow(){
		setTitle("0thello");
		
		//Frame Init
		//add(mainPanel);
		setMinimumSize(new Dimension(400,600));
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
	}
}
