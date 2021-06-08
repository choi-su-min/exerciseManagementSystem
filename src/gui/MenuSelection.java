package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel{
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();	//라벨을 위한 패널
		JPanel panel2 = new JPanel();	//버튼을 위한 패널
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Exercise");
		JButton button2 = new JButton("View Exercise");
		JButton button3 = new JButton("Edit Exercise");
		JButton button4 = new JButton("Delete Exercise");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);	//패널1에 라벨을 넣어줌.
		panel2.add(button1);	//패널2에 버튼을 넣음.
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);	//패널1을 맨위에 위치.
		this.add(panel2, BorderLayout.CENTER);	//패널2를 중앙에 위치.
		
	}
}
