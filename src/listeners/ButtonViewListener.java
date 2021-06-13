package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import exerciseManagementSystem.ExerciseClassmanager;
import gui.ExerciseViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {			//view를 실행시키는 버튼을 만들어줌.
		ExerciseViewer exerciseViewer = frame.getExericseviewer();
		ExerciseClassmanager exerciseManager = getObject("exerciseManager.ser");
		exerciseViewer.setExerciseManager(exerciseManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(exerciseViewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static ExerciseClassmanager getObject(String filename) {		
		ExerciseClassmanager exerciseManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			exerciseManager = (ExerciseClassmanager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return exerciseManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return exerciseManager;
	}
}
