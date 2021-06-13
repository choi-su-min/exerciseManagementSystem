package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import exerciseManagementSystem.ExerciseClassmanager;
import listeners.ExerciseAddCancelListener;
import listeners.ExerciseAdderListener;

public class ExerciseAdder extends JPanel{
	WindowFrame frame;
	
	ExerciseClassmanager exerciseManager;
	
	public ExerciseAdder(WindowFrame frame, ExerciseClassmanager exerciseManager) {
		this.frame = frame;
		this.exerciseManager = exerciseManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());	
		
		JLabel labelPart = new JLabel("Part: ",JLabel.TRAILING);	//Spring�� ��ġ�� trailing������ ����.
		JTextField fieldPart = new JTextField(10);	//textfield�� ����� ũ�⸦ 10���� ����.
		labelPart.setLabelFor(fieldPart);	//labelpart�κп� field�� �ڸ��� �������.
		panel.add(labelPart);	//�гο� label�� �־���.
		panel.add(fieldPart);	//�гο� field�� �־���
		
		JLabel labelSet = new JLabel("Set: ",JLabel.TRAILING);
		JTextField fieldSet = new JTextField(10);
		labelSet.setLabelFor(fieldSet);
		panel.add(labelSet);
		panel.add(fieldSet);
		
		JLabel labelTimes = new JLabel("Times: ",JLabel.TRAILING);
		JTextField fieldTimes = new JTextField(10);
		labelTimes.setLabelFor(fieldTimes);
		
		JButton saveButton = new JButton("save");		//save����� ����ϴ� ��ư����.
		saveButton.addActionListener(new ExerciseAdderListener(fieldPart, fieldSet, fieldTimes, exerciseManager));
		
		JButton cancelButton = new JButton("cancel");	//cancel����� ����ϴ� ��ư����.
		cancelButton.addActionListener(new ExerciseAddCancelListener(frame));
		
		panel.add(labelTimes);
		panel.add(fieldTimes);
		
		panel.add(saveButton);	//�гο� save��ư�� cancel��ư�� �߰�.
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);	//SpringUtilities Ŭ������ ����� ���.
		
//		this.setSize(300,300);	//frameSize����.
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.setVisible(true);
		
	}
}
