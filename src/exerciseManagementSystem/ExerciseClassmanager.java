package exerciseManagementSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import exercise.BackExercise;
import exercise.ChestExercise;
import exercise.ExerciseKind;
import exercise.ExerciseInput;
import exercise.ShoulderExercise;


public class ExerciseClassmanager implements Serializable{					//serializable을 implements해줌.
	/**
	 * 
	 */
	private static final long serialVersionUID = 1329390453602370418L;
	
	ArrayList<ExerciseInput> exercises = new ArrayList<ExerciseInput>(); 
	transient Scanner input;
	
	ExerciseClassmanager(Scanner input){
		this.input = input;
	}
	
	public void addexercise(String Part, int Set, int Times) {
		ExerciseInput exercise = new ChestExercise(ExerciseKind.Chest);  
		exercise.getExerciseInput(input);			
		exercises.add(exercise);
	}
	
	public void addexercise(ExerciseInput exercise) {			
		exercises.add(exercise);
	}
	
	public void addexercise() {
		int kind = 0;
		ExerciseInput exercise = null;  
		
		while(kind != 1 && kind !=2 && kind !=3) {
			try {													
				showaddMenu();
				kind = input.nextInt();
				switch(kind) {										
				case 1:
					addExerciseChest(exercise, input);
					break;
				case 2:
					addExerciseShoulder(exercise, input);
					break;
				case 3:
					addExerciseBack(exercise, input);
					break;
				default:
					System.out.print("Select num 1, 2 and 3 for Exercise Kind :");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("***Please put an integer between 1 and 3***");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
			
	
	}
	
	public void deleteexercise() {
		System.out.print("exercise part :");
		String part = input.next();	
		int index = -1;
		for(int i=0; i<exercises.size(); i++) {
			if(exercises.get(i).getPart() .equals(part)) { 
				index = i;
				break;
			}
		}
		removefromExercises(index, part);
	}
	
	public void removefromExercises(int index, String part) {	
		if(index >= 0) {
			exercises.remove(index);
			System.out.println("the exercise part " + part + " is deleted");
			return;
		}
		
		else {
			System.out.println("the exercise part has been stored");
			return;
		}
	}
	
	public void editexercise() {
		System.out.print("exercise part :");
		String exercisepart = input.next();	  
		for(int i=0; i<exercises.size(); i++) {
			ExerciseInput exercise = exercises.get(i);
			if(exercise.getPart() .equals(exercisepart)) {
				int num = -1;
				while(num != 4) {								
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						exercise.setExercisePart(input);
						break;
					case 2:
						exercise.setExerciseSet(input);
						break;
					case 3:
						exercise.setExerciseTimes(input);
						break;
					default:
						continue;
					}		
				}
				break;
			}
		}
	}
	
	public void viewexercises() {
		System.out.println("# of stored exercises : "+ exercises.size()+"개");
		for(int i=0; i<exercises.size(); i++) {
			exercises.get(i).printInfo();
		}
	}
	
	public int size() {							//gui ExerciseViewer에서 exercises의 size을 알 수 있게해줌.
		return exercises.size();
	}
	
	public ExerciseInput get(int index) {		//index을 받아 input되어있는 값들을 gui에서 끌어다 씀.
		return exercises.get(index);
	}
	
	public void showEditMenu() {												
		System.out.println("** Exercise Info Edit Menu **");
		System.out.println("1. Edit part");
		System.out.println("2. Edit set");
		System.out.println("3. Edit times");
		System.out.println("4. exit");
		System.out.println("select one number between 1-4:");
	}
	
	public void showaddMenu() {													
		System.out.println("1. for Chest :");
		System.out.println("2. for Shoulder :");
		System.out.println("3. for back :");
		System.out.println("Select num 1, 2 and 3 for Exercise Kind :");
	}
	
	public void addExerciseChest(ExerciseInput exercise, Scanner input) {		
		exercise = new ChestExercise(ExerciseKind.Chest);  
		exercise.getExerciseInput(input);			
		exercises.add(exercise); 
	}
	
	public void addExerciseShoulder(ExerciseInput exercise, Scanner input) {	
		exercise = new ShoulderExercise(ExerciseKind.Shoulder);  
		exercise.getExerciseInput(input);			
		exercises.add(exercise);
	}
	
	public void addExerciseBack(ExerciseInput exercise, Scanner input) {		
		exercise = new BackExercise(ExerciseKind.Back);  
		exercise.getExerciseInput(input);			
		exercises.add(exercise);
	}
}
