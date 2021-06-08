package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import exerciseManagementSystem.ExerciseClassmanager;

public class WindowFrame extends JFrame{
	
	ExerciseClassmanager exerciseManager;		//ExerciseClassmanager타입 객체생성
	
	MenuSelection menuselection;				//menu, adder, viewr각각 객체생성
	ExerciseAdder exerciseadder;
	ExerciseViewer exericseviewer;

	public WindowFrame(ExerciseClassmanager exerciseManager) {		//exercisemanager의 parameter를 받고 Frame생성.
		this.setSize(500,300);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.exerciseManager = exerciseManager;
		
		this.menuselection = new MenuSelection(this);
		this.exerciseadder = new ExerciseAdder(this);
		this.exericseviewer = new ExerciseViewer(this, this.exerciseManager);
		
		//this.setupPanel(menuselection);
		this.add(menuselection);
		this.setVisible(true);	//Frame을 window로 실체화.
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {					//menu, add, view의 gettor, settor생성. 
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
