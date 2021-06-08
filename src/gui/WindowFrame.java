package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import exerciseManagementSystem.ExerciseClassmanager;

public class WindowFrame extends JFrame{
	
	ExerciseClassmanager exerciseManager;		//ExerciseClassmanagerŸ�� ��ü����
	
	MenuSelection menuselection;				//menu, adder, viewr���� ��ü����
	ExerciseAdder exerciseadder;
	ExerciseViewer exericseviewer;

	public WindowFrame(ExerciseClassmanager exerciseManager) {		//exercisemanager�� parameter�� �ް� Frame����.
		this.setSize(500,300);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.exerciseManager = exerciseManager;
		
		this.menuselection = new MenuSelection(this);
		this.exerciseadder = new ExerciseAdder(this);
		this.exericseviewer = new ExerciseViewer(this, this.exerciseManager);
		
		//this.setupPanel(menuselection);
		this.add(menuselection);
		this.setVisible(true);	//Frame�� window�� ��üȭ.
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {					//menu, add, view�� gettor, settor����. 
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public ExerciseAdder getExerciseadder() {
		return exerciseadder;
	}

	public void setExerciseadder(ExerciseAdder exerciseadder) {
		this.exerciseadder = exerciseadder;
	}

	public ExerciseViewer getExericseviewer() {
		return exericseviewer;
	}

	public void setExericseviewer(ExerciseViewer exericseviewer) {
		this.exericseviewer = exericseviewer;
	}
}
