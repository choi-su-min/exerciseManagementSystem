package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ExerciseAdder extends JPanel{
	WindowFrame frame;
	
	public ExerciseAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());	
		
		JLabel labelPart = new JLabel("Part: ",JLabel.TRAILING);	//Spring의 위치를 trailing을통해 지정.
		JTextField fieldPart = new JTextField(10);	//textfield를 만들어 크기를 10으로 지정.
		labelPart.setLabelFor(fieldPart);	//labelpart부분에 field의 자리를 만들어줌.
		panel.add(labelPart);	//패널에 label을 넣어줌.
		panel.add(fieldPart);	//패널에 field를 넣어줌
		
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
		
		panel.add(new JButton("save"));	//패널에 save버튼과 cancel버튼을 추가.
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);	//SpringUtilities 클래스를 끌어와 사용.
		
//		this.setSize(300,300);	//frameSize설정.
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.setVisible(true);
		
	}
}
