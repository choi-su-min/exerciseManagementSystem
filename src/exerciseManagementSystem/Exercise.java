package exerciseManagementSystem;

public class Exercise {
	String part;
	int set;
	int times;
	
	public Exercise() {
	}
	
	public Exercise(String part) {
		this.part = part;
	}
	
	public Exercise(String part, int set, int times) {
		this.part = part;
		this.set = set;
		this.times = times;
	}
	
	public void printInfo() {
		System.out.println("part : "+ part +" set : "+ set +" times : "+ times);
	}
	
}
