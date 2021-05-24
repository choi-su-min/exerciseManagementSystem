package exerciseManagementSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class ExerciseMenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ExerciseClassmanager exerciseManager = getObject("exerciseManager.ser");//
		if(exerciseManager == null)
			exerciseManager = new ExerciseClassmanager(input);
		
		selectMenu(input, exerciseManager);
		putObject(exerciseManager, "exerciseManager.ser");
	}
	
	public static void selectMenu(Scanner input, ExerciseClassmanager exerciseManager) {	
		int num=-1;
		
		while(num != 5) {		
			try {																			
				showMenu();
				num=input.nextInt();
				switch(num) {
				case 1:
					exerciseManager.addexercise();
					logger.log("addexercise");
					break;
				case 2:
					exerciseManager.deleteexercise();
					logger.log("deleteexercise");
					break;
				case 3:
					exerciseManager.editexercise();
					logger.log("editexercise");
					break;
				case 4:
					exerciseManager.viewexercises();
					logger.log("viewexercises");
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
	
	public static void showMenu() {		
		System.out.println("1. add exercise");
		System.out.println("2. delete exercise");
		System.out.println("3. edit exercise");
		System.out.println("4. View exercises");
		System.out.println("5. exit");
		System.out.println("select one number between 1-5:");
	}
	
	public static ExerciseClassmanager getObject(String filename) {		
		ExerciseClassmanager exerciseManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			exerciseManager = (ExerciseClassmanager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return exerciseManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return exerciseManager;
	}
	
	public static void putObject(ExerciseClassmanager exerciseManager, String filename) {		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(exerciseManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
