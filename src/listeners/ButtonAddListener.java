package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ExerciseAdder;
import gui.ExerciseViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {		//add�� ���� �� �ֵ��� �ϴ� ����� ����.
		JButton b = (JButton) e.getSource();
		ExerciseAdder adder = frame.getExerciseadder();
		frame.setupPanel(adder);

	}

}
