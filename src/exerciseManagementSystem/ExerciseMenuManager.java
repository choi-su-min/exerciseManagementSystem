package exerciseManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseManagement {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ExerciseClassmanager exerciseManager = new ExerciseClassmanager(input);
		
		selectMenu(input, exerciseManager);
	}
	
	public static void selectMenu(Scanner input, ExerciseClassmanager exerciseManager) {	//0514 �����Լ����� �޴��� �����ϴ� �Լ��� ���� �������.
		int num=-1;
		
		while(num != 5) {		//0514switch������ ���� �����ϰ� ����.
			try {																			//0514 Exception ����ó���� ���� �������� ���� �ʾ��� �� ����� �����.
				showMenu();
				num=input.nextInt();
				switch(num) {
				case 1:
					exerciseManager.addexercise();
					break;
				case 2:
					exerciseManager.deleteexercise();
					break;
				case 3:
					exerciseManager.editexercise();
					break;
				case 4:
					exerciseManager.viewexercises();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("***Please put an integer between 1 and 5***");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {		//0514 ���� �޴��� ������ִ� �Լ�
		System.out.println("1. add exercise");
		System.out.println("2. delete exercise");
		System.out.println("3. edit exercise");
		System.out.println("4. View exercises");
		System.out.println("5. exit");
		System.out.println("select one number between 1-5:");
	}
}
