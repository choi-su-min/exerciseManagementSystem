package exercise;

import java.util.Scanner;

import exception.PartFormatException;

public abstract class Exercise implements ExerciseInput {

	protected ExerciseKind Kind = ExerciseKind.Chest;
	protected String part;
	protected int set;
	protected int times;
	
	public Exercise() {
	}
	
	public Exercise(ExerciseKind Kind) {
		this.Kind = Kind;
	}
	
	public Exercise(String part) {
		this.part = part;
	}
	
	public Exercise(String part, int set, int times) {
		this.part = part;
		this.set = set;
		this.times = times;
	}
	
	public Exercise(ExerciseKind Kind, String part, int set, int times) {
		this.Kind = Kind;  
		this.part = part;
		this.set = set;
		this.times = times;
	}
	
	public ExerciseKind getKind() {        
		return Kind;
	}

	public void setKind(ExerciseKind kind) { 
		Kind = kind;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) throws PartFormatException{	//0514 Part를 W와 H를 통해 평일과 주말을 구분 W를 포함하게 입력을 해주도록 하고 W가 입력되지 않으면 예외처리. 
		if(!part.contains("W")) {
			throw new PartFormatException();
		}
		this.part = part;
	}

	public int getSet() {
		return set;
	}

	public void setSet(int set) {
		this.set = set;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}                                        
	
	public abstract void printInfo();	
	
	public void setExercisePart(Scanner input) {		//0514 part를 edit하는 기능을 담당하는 함수
		String part = "";
		while(!part.contains("W")) {
			System.out.println("Exercise part : ");
			part = input.next();
			try {										//0514 Part를 W와 H를 통해 평일과 주말을 구분 W를 포함하게 입력을 해주도록 하고 W가 입력되지 않으면 예외처리.
				this.setPart(part);
			} catch (PartFormatException e) {
				System.out.println("Incorrect Part Format. put the correct part format contain W");
			}
		}
	}
	
	public void setExerciseSet(Scanner input) {			//0514 set을 edit하는 기능을 담당하는 함수
		System.out.println("Exercise set : ");
		int set = input.nextInt();
		this.setSet(set);
	}
	
	public void setExerciseTimes(Scanner input) {		//0514 times를 edit하는 기능을 담당하는 함수
		System.out.println("Exercise times : ");
		int times = input.nextInt();
		this.setTimes(times);
	}
	
	
}
