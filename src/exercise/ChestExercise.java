package exercise;

import java.util.Scanner;

public class ChestExercise extends Exercise {
	
	protected int holidayset;							//0501 주말에 시행하는 set수를 설정.
	protected int holidaytimes;							//0501 주말 times
	
	public ChestExercise(ExerciseKind Kind) {
		super.Kind = Kind;
	}
	
	public void getExerciseInput(Scanner input) {
		System.out.print("exercise part :");
		String part = input.next();
		this.setPart(part);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have set? on weekdays (Y/N) ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {										
				System.out.print("How many have number of set? on weekdays :");
				int set = input.nextInt();
				this.setSet(set);
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
		
		answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {		//0501 while문을 하나 더 추가해서 주말에 set횟수를 설정.
			System.out.println("Do you have holidayset? (Y/N) ");						//0501 주말에 set를 할 것인지 질문 출력
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {										//0501 yes일 때는 그냥 평소에 실시하는 set횟수 혹은 더 올리고자하는 횟수.
				System.out.print("How many have number of holidayset? :");						//주말에는 평일의 횟수 만큼은 하지만 set를 변화시켜줌.
				int set = input.nextInt();
				this.setSet(set);
				break;
			}
			else if(answer == 'n' || answer == 'N') {									//0501 (추가해줘야 할 것) no를 선택했을 때 조건문을 한 번 더 돌려서 주말이면 set횟수를 줄이거나 없애는 조정을 해줌
				System.out.println("You don't exercise to strengthen one's muscles (holyday).");  //0501 set를 갖고 있지 않으면 이 운동은 하지 않는다고 출력.
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
	
	public void printInfo() {       		//0501 exercise의 종류를출력
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
		System.out.println("kind : "+ skind +", part : "+ part +", set : "+ set +", times : "+ times +", holidayset : "+ set +", holidaytimes : "+ times);
	}
}
