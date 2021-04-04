package exerciseManagementSystem;

import java.util.Scanner;

public class ExerciseClassmanager {
	Exercise exercise;
	Scanner input;
	
	ExerciseClassmanager(Scanner input){
		this.input = input;
	}
	
	public void addexercise() {
		exercise = new Exercise();
		System.out.print("exercise part :");
		exercise.part = input.next();
		System.out.print("number of set :");
		exercise.set = input.nextInt();
		System.out.print("number of times :");
		exercise.times = input.nextInt();	
	}
	
	public void deleteexercise() {
		System.out.print("exercise part :");
		String part = input.next();	
		if(exercise == null) {
			System.out.println("the exercise part has been stored");
			return;
		}
		if(exercise.part .equals(part)) {
			exercise = null;
			System.out.println("the exercise part is deleted");
		}
	}
	
	public void editexercise() {
		System.out.print("exercise part :");
		String part = input.next();	
		if(exercise.part .equals(part)) {
			System.out.println("the exercise part to be edited is "+part);
		}
	}
	
	public void viewexercise() {
		System.out.print("exercise part :");
		String part = input.next();
		if(exercise.part .equals(part)) {
			exercise.printInfo();
		}
	}

}
