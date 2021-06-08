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
		
		JPanel panel1 = new JPanel();	//���� ���� �г�
		JPanel panel2 = new JPanel();	//��ư�� ���� �г�
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Exercise");
		JButton button2 = new JButton("View Exercise");
		JButton button3 = new JButton("Edit Exercise");
		JButton button4 = new JButton("Delete Exercise");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);	//�г�1�� ���� �־���.
		panel2.add(button1);	//�г�2�� ��ư�� ����.
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);	//�г�1�� ������ ��ġ.
		this.add(panel2, BorderLayout.CENTER);	//�г�2�� �߾ӿ� ��ġ.
		
	}
}
