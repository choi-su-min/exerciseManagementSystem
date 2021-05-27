package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ExerciseAdder extends JFrame{
	
	public ExerciseAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelPart = new JLabel("Part: ",JLabel.TRAILING);
		JTextField fieldPart = new JTextField(10);
		labelPart.setLabelFor(fieldPart);
		panel.add(labelPart);
		panel.add(fieldPart);
		
		JLabel labelSet = new JLabel("Set: ",JLabel.TRAILING);
		JTextField fieldSet = new JTextField(10);
		labelSet.setLabelFor(fieldSet);
		panel.add(labelSet);
		panel.add(fieldSet);
		
		JLabel labelTimes = new JLabel("Times: ",JLabel.TRAILING);
		JTextField fieldTimes = new JTextField(10);
		labelTimes.setLabelFor(fieldTimes);
		panel.add(labelTimes);
		panel.add(fieldTimes);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
		
	}
}
