package exercise;

import java.util.Scanner;

public class ChestExercise extends Exercise {
	public void getExerciseInput(Scanner input) {
		System.out.print("exercise part :");
		String part = input.next();
		this.setPart(part);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have set? (Y/N) ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("number of set :");
				int set = input.nextInt();
				this.setSet(set);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setSet(0);
				break;
			}
			else {
			}
		}
		System.out.print("number of times :");
		int times = input.nextInt();
		this.setTimes(times);
	}
}
