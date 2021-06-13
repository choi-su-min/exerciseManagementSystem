package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ExerciseAdder;
import gui.ExerciseViewer;
import gui.WindowFrame;

public class ExerciseAddCancelListener implements ActionListener {

	WindowFrame frame;
	
	public ExerciseAddCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {		//add�� ���� �� �ֵ��� �ϴ� ����� ����.
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());		
		frame.revalidate();
		frame.repaint();
	}

}
