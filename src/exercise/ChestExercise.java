package exercise;

import java.util.Scanner;

public class ChestExercise extends Exercise {							
	
	public ChestExercise(ExerciseKind Kind) {
		super.Kind=Kind;
	}
	
	public void getExerciseInput(Scanner input) {
		setExercisePart(input);											
		setExerciseSetwithYN(input);
		setExerciseTimes(input);
	}
	
	public void setExerciseSetwithYN(Scanner input) {					
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have set? on weekdays (Y/N) ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {										
				setExerciseSet(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {									
				System.out.println("You don't exercise to strengthen one's muscles.");  
				this.setSet(0);
				break;
			}
			else {
			}
		}
	}
	
	public void printInfo() {       		
		String ekind = getKindString();
		System.out.println("kind : "+ ekind +", part : "+ part +", weekdayset : "+ set +", times : "+ times);
	}
	
	public String getKindString() {
		String ekind = "none";
		switch(this.Kind) {
		case Chest:
			ekind = "Chest.";
			break;
		case Shoulder:
			ekind = "Shoulder.";
			break;
		case Back:
			ekind = "Back.";
			break;
		default:
		}
		return ekind;
	}
}
