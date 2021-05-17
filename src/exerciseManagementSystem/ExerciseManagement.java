package exerciseManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseManagement {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ExerciseClassmanager exerciseManager = new ExerciseClassmanager(input);
		
		selectMenu(input, exerciseManager);
	}
	
	public static void selectMenu(Scanner input, ExerciseClassmanager exerciseManager) {	//0514 메인함수에서 메뉴를 선택하는 함수를 따로 만들어줌.
		int num=-1;
		
		while(num != 5) {		//0514switch문으로 더욱 간결하게 변경.
			try {																			//0514 Exception 예외처리를 통해 정수값이 들어가지 않았을 때 경고문을 띄워줌.
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
	
	public static void showMenu() {		//0514 시작 메뉴를 출력해주는 함수
		System.out.println("1. add exercise");
		System.out.println("2. delete exercise");
		System.out.println("3. edit exercise");
		System.out.println("4. View exercises");
		System.out.println("5. exit");
		System.out.println("select one number between 1-5:");
	}
}
