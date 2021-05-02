package exercise;

import java.util.Scanner;

public class Exercise {

	protected ExerciseKind Kind = ExerciseKind.Chest; //ExerciseKind���� ������
	protected String part; //��ĸ�����̼� ����.
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
		this.Kind = Kind;  //0501 ��� �������� ������� �� �ֵ��� 
		this.part = part;
		this.set = set;
		this.times = times;
	}
	
	public ExerciseKind getKind() {          //get set ���� ---
		return Kind;
	}

	public void setKind(ExerciseKind kind) { 
		Kind = kind;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
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
	}                                        //get set ���� ---
	
	public void printInfo() {       		//exercise�� ������
		String skind = "none";
		switch(this.Kind) {
		case Chest:
			skind = "Chest.";
			break;
		case Shoulder:
			skind = "Shoulder.";
			break;
		case Back:
			skind = "Back.";
			break;
		default:
		}
		System.out.println("kind : "+ skind +", part : "+ part +", set : "+ set +", times : "+ times);
	}
	
	public void getExerciseInput(Scanner input) {
		System.out.print("exercise part :");
		String part = input.next();
		this.setPart(part);
		
		System.out.print("number of set :");
		int set = input.nextInt();
		this.setSet(set);

		System.out.print("number of times :");
		int times = input.nextInt();
		this.setTimes(times);
	}
	
}
