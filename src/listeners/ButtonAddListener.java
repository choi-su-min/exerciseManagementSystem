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
	public void actionPerformed(ActionEvent e) {		//add를 누를 수 있도록 하는 기능을 실행.
		JButton b = (JButton) e.getSource();
		ExerciseAdder adder = frame.getExerciseadder();
		frame.setupPanel(adder);

	}

}
