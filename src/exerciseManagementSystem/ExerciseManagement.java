package exerciseManagementSystem;

import java.util.Scanner;

public class ExerciseManagement {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ExerciseClassmanager exerciseclass = new ExerciseClassmanager(input);
		
		int num=0;
		
		while(num != 5) {
			System.out.println("1. add exercise");
			System.out.println("2. delete exercise");
			System.out.println("3. edit exercise");
			System.out.println("4. View exercise");
			System.out.println("5. exit");
			System.out.println("select one number between 1-5:");
			num=input.nextInt();
			if(num==1) {
				exerciseclass.addexercise();
			}
			else if (num==2) {
				exerciseclass.deleteexercise();
			}
			else if (num==3) {
				exerciseclass.editexercise();
			}
			else if (num==4) {
				exerciseclass.viewexercise();
			}
			else {
				continue;
			}
		}
	}
	
	
}
