package exercise;

import java.util.Scanner;

public abstract class SmallMuscle extends Exercise {					
	
	public SmallMuscle(ExerciseKind Kind) {
		super(Kind);
	}

	@Override
	public abstract void getExerciseInput(Scanner input);

	@Override
	public void printInfo() {       		
		String ekind = getKindString();
		System.out.println("kind : "+ ekind +", part : "+ part +", weekdayset : "+ set +", times : "+ times +", hoildayset : "+ set +", times : "+ times);
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
