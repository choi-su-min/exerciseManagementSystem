package exercise;

import java.util.Scanner;

public abstract class SmallMuscle extends Exercise {					//0514 Shoulder와 같이 소근육 운동같은 경우는 강도를 조절해 주기위해 주말을 분리 시켜줌.
	
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
	
	public void setExerciseSetwithYN(Scanner input) {					//0514 setExerciseSetwithYN를 만들어서 입력함수를 분리.
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
