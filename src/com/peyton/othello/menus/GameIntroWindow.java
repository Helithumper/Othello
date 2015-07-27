package com.peyton.othello.menus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GameIntroWindow extends JFrame implements ActionListener {
	private JLabel title = new JLabel("0thello");
	private JButton playButton = new JButton("Play");
	private JPanel mainPanel = new JPanel();
	
	public GameIntroWindow(){
		setTitle("0thello");
		
		//MainPanel Init
		mainPanel.setLayout(new GridLayout(2,1));
		mainPanel.add(title);
		
		//Title Label Init
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Veranda",2,60));
		title.setForeground(Color.decode("#E1CA96"));
		
		
		//Play Button Init
		playButton.setFont(new Font("Veranda",1,40));
		playButton.setBackground(Color.decode("#626C66"));
		playButton.setForeground(Color.decode("#E1CA96"));
		playButton.setBorder(null);
		playButton.setFocusPainted(false);
		playButton.addActionListener(this);
		
		//Main Panel Adding and Setting
		mainPanel.add(playButton);
		mainPanel.setBorder(BorderFactory.createEmptyBorder(50,100,200,100));
		mainPanel.setBackground(Color.decode("#434A42"));
		
		//Frame Init Stuff
		add(mainPanel);
		setMinimumSize(new Dimension(400,600));
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==playButton){
			setVisible(false);
			new GameWindow();
		}
		
	}
}