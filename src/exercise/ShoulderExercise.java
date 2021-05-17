package exercise;

import java.util.Scanner;

public class ShoulderExercise extends SmallMuscle {   					//0514 어깨는 상대적으로 소근육이기 때문에 주말은 구분을 해줌.				
	
	protected int holidayset;							
	protected int holidaytimes;							
	
	public ShoulderExercise(ExerciseKind Kind) {
		super(Kind);
	}
	
	public void getExerciseInput(Scanner input) {
		setExercisePart(input);											//0514 getExerciseInput함수에서 setExercisePart를 분리시켜줌.
		setExerciseSetwithYN(input);
		setholidayExerciseSetwithYN(input);
		setExerciseTimes(input);
	}
	
	public void setholidayExerciseSetwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {		
			System.out.println("Do you have holidayset? (Y/N) ");						
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {										
				setExerciseSet(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {									
				System.out.println("You don't exercise to strengthen one's muscles (holiday).");  
				this.setSet(0);
				break;
			}
			else {
			}
		}
	}
}
