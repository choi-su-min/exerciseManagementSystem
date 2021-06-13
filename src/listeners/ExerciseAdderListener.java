package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.PartFormatException;
import exercise.ChestExercise;
import exercise.ExerciseInput;
import exercise.ExerciseKind;
import exerciseManagementSystem.ExerciseClassmanager;

public class ExerciseAdderListener implements ActionListener {
	JTextField fieldPart;
	JTextField fieldSet;
	JTextField fieldTimes;	
	ExerciseClassmanager exerciseManager;
	
	public ExerciseAdderListener(JTextField fieldPart, JTextField fieldSet, JTextField fieldTimes, ExerciseClassmanager exerciseManager) {
		this.fieldPart = fieldPart;
		this.fieldSet = fieldSet;
		this.fieldTimes = fieldTimes;
		this.exerciseManager = exerciseManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ExerciseInput exercise = new ChestExercise(ExerciseKind.Chest);			//chestexercise�� add�ϱ� ���� ��ü.
		try {
			exercise.setPart(fieldPart.getText());								//Part���� �Է�.
			exercise.setSet(Integer.parseInt(fieldSet.getText()));				//set���� �Է�.
			exercise.setTimes(Integer.parseInt(fieldTimes.getText()));			//times���� �Է�.
			exerciseManager.addexercise(exercise);
			putObject(exerciseManager, "exerciseManager.ser");	
			exercise.printInfo();												//�������.
		} catch (PartFormatException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(ExerciseClassmanager exerciseManager, String filename) {		//frame���� add���� �� �Է��� ������ �������ֱ� ���� method.
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(exerciseManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
