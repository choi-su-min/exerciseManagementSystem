package exerciseManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

import exercise.BackExercise;
import exercise.ChestExercise;
import exercise.Exercise;
import exercise.ExerciseKind;
import exercise.ShoulderExercise;

public class ExerciseClassmanager {
	ArrayList<Exercise> exercises = new ArrayList<Exercise>(); 
	Scanner input;
	
	ExerciseClassmanager(Scanner input){
		this.input = input;
	}
	
	public void addexercise() {
		int kind = 0;
		Exercise exercise;
		
		while(kind != 1 && kind !=2 && kind !=3) {
			System.out.println("1 for Chest :");
			System.out.println("2 for Shoulder :");
			System.out.println("3 for back :");
			System.out.println("Select num 1, 2 and 3 for Exercise Kind :");
			kind = input.nextInt();
			if(kind == 1) {
				exercise = new ChestExercise(ExerciseKind.Chest);
				exercise.getExerciseInput(input);
				exercises.add(exercise); //추가한 운동들을 저장
				break;
			}
			else if(kind == 2) {
				exercise = new ShoulderExercise(ExerciseKind.Shoulder);
				exercise.getExerciseInput(input);
				exercises.add(exercise); //추가한 운동들을 저장
				break;
			}
			else if(kind == 3) {
				exercise = new BackExercise(ExerciseKind.Back);
				exercise.getExerciseInput(input);
				exercises.add(exercise); //추가한 운동들을 저장
				break;
			}
			else {
				System.out.print("Select num 1, 2 and 3 for Exercise Kind :");
			}
		}
	
	}
	
	public void deleteexercise() {
		System.out.print("exercise part :");
		String part = input.next();	
		int index = -1;  //배열에서 인덱스를 찾지 못하게함.
		for(int i=0; i<exercises.size(); i++) {
			if(exercises.get(i).getPart() .equals(part)) { //exercise배열의 하나의 정보와 입력한 것이 같은지 판별
				index = i;
				break;
			}
		}
		if(index >= 0) {
			exercises.remove(index);
			System.out.println("the exercise part " + part + " is deleted");
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
			Exercise exercise = exercises.get(i);
			if(exercise.getPart() .equals(exercisepart)) {
				int num = -1;
				while(num != 4) {
					System.out.println("** Exercise Info Edit Menu **");
					System.out.println("1. Edit part");
					System.out.println("2. Edit set");
					System.out.println("3. Edit times");
					System.out.println("4. exit");
					System.out.println("select one number between 1-4:");
					num = input.nextInt();
					if (num==1) {
						System.out.println("Exercise part : ");
						String part = input.next();
						exercise.setPart(part);
					}
					else if (num==2) {
						System.out.println("Exercise set : ");
						int set = input.nextInt();
						exercise.setSet(set);
					}
					else if (num==3) {
						System.out.println("Exercise times : ");
						int times = input.nextInt();
						exercise.setTimes(times);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewexercises() {
		for(int i=0; i<exercises.size(); i++) {
			exercises.get(i).printInfo();
		}
	}

}
