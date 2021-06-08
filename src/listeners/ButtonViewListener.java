package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ExerciseViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {			//view를 실행시키는 버튼을 만들어줌.
		JButton b = (JButton) e.getSource();
		ExerciseViewer viewer = frame.getExericseviewer();
		frame.setupPanel(viewer);

	}

}
