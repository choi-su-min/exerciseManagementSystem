package exerciseManagementSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import exercise.BackExercise;
import exercise.ChestExercise;
import exercise.Exercise;
import exercise.ExerciseKind;
import exercise.ExerciseInput;
import exercise.ShoulderExercise;

public class ExerciseClassmanager {
	ArrayList<ExerciseInput> exercises = new ArrayList<ExerciseInput>(); 
	Scanner input;
	
	ExerciseClassmanager(Scanner input){
		this.input = input;
	}
	
	public void addexercise() {
		int kind = 0;
		ExerciseInput exercise = null;  
		
		while(kind != 1 && kind !=2 && kind !=3) {
			try {													//0514 Exception 예외처리를 통해 정수값이 들어가지 않았을 때 경고문을 띄워줌.
				showaddMenu();
				kind = input.nextInt();
				switch(kind) {										//0514 switch문을 통해 더욱 간략하게 표현
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
	
	public void removefromExercises(int index, String part) {	//delete함수에서 제거해주는 기능을 따로 뽑아 함수를 만들어줌.
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
				while(num != 4) {								//switch문을 이용해 간략하게 만들어줌.
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
	
	public void showEditMenu() {												//0514 edit하고자하는 부분을 보여주는 menu출력 함수
		System.out.println("** Exercise Info Edit Menu **");
		System.out.println("1. Edit part");
		System.out.println("2. Edit set");
		System.out.println("3. Edit times");
		System.out.println("4. exit");
		System.out.println("select one number between 1-4:");
	}
	
	public void showaddMenu() {													//0514 add하고자하는 부분을 보여주는 menu출력 함수
		System.out.println("1. for Chest :");
		System.out.println("2. for Shoulder :");
		System.out.println("3. for back :");
		System.out.println("Select num 1, 2 and 3 for Exercise Kind :");
	}
	
	public void addExerciseChest(ExerciseInput exercise, Scanner input) {		//0514 Chest를 add하는 기능을 담당하는 함수
		exercise = new ChestExercise(ExerciseKind.Chest);  
		exercise.getExerciseInput(input);			
		exercises.add(exercise); 
	}
	
	public void addExerciseShoulder(ExerciseInput exercise, Scanner input) {	//0514 Shoulder를 add하는 기능을 담당하는 함수
		exercise = new ShoulderExercise(ExerciseKind.Shoulder);  
		exercise.getExerciseInput(input);			
		exercises.add(exercise);
	}
	
	public void addExerciseBack(ExerciseInput exercise, Scanner input) {		//0514 Back을 add하는 기능을 담당하는 함수
		exercise = new BackExercise(ExerciseKind.Back);  
		exercise.getExerciseInput(input);			
		exercises.add(exercise);
	}
}
