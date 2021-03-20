package exerciseManagementSystem;

import java.util.Scanner;

public class ExerciseManagement {
	
	public static void main(String[] args) {
		int num=0;
		Scanner input = new Scanner(System.in);
		
		while(num != 5) {
			System.out.println("1. division way");
			System.out.println("2. meal way");
			System.out.println("3. position way");
			System.out.println("4. Show a menu");
			System.out.println("5. exit");
			System.out.println("select one number between 1-5:");
			num=input.nextInt();
			if(num==1) {
				divisionway();
			}
			else if (num==2) {
				mealway();
			}
			else if (num==3) {
				positionway();
			}
			else {
				continue;
			}
		}
	}
	
	public static void divisionway() {
		Scanner input = new Scanner(System.in);
		System.out.print("today part :");
		String todaypart = input.next();
		System.out.print("tomorrow part :");
		String tomorrowpart = input.next();
		System.out.print("day after tomorrow part :");
		String dayaftertomorrowpart = input.next();
	}
	public static void mealway() {
		Scanner input = new Scanner(System.in);
		System.out.print("morning :");
		String morning = input.next();
		System.out.print("lunch :");
		String lunch = input.next();
		System.out.print("dinner :");
		String dinner = input.next();
	}
	public static void positionway() {
		Scanner input = new Scanner(System.in);
		System.out.print("upperbody :");
		String upperbody = input.next();
		System.out.print("lowerbody :");
		String lowerbody = input.next();
	}

}
