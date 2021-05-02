package exercise;

import java.util.Scanner;

public class ChestExercise extends Exercise {
	
	protected int holidayset;							//0501 �ָ��� �����ϴ� set���� ����.
	protected int holidaytimes;							//0501 �ָ� times
	
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
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {		//0501 while���� �ϳ� �� �߰��ؼ� �ָ��� setȽ���� ����.
			System.out.println("Do you have holidayset? (Y/N) ");						//0501 �ָ��� set�� �� ������ ���� ���
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {										//0501 yes�� ���� �׳� ��ҿ� �ǽ��ϴ� setȽ�� Ȥ�� �� �ø������ϴ� Ƚ��.
				System.out.print("How many have number of holidayset? :");						//�ָ����� ������ Ƚ�� ��ŭ�� ������ set�� ��ȭ������.
				int set = input.nextInt();
				this.setSet(set);
				break;
			}
			else if(answer == 'n' || answer == 'N') {									//0501 (�߰������ �� ��) no�� �������� �� ���ǹ��� �� �� �� ������ �ָ��̸� setȽ���� ���̰ų� ���ִ� ������ ����
				System.out.println("You don't exercise to strengthen one's muscles (holyday).");  //0501 set�� ���� ���� ������ �� ��� ���� �ʴ´ٰ� ���.
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
	
	public void printInfo() {       		//0501 exercise�� ���������
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
