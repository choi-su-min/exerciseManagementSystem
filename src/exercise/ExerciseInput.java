package exercise;

import java.util.Scanner;

import exception.PartFormatException;

public interface ExerciseInput {
	public String getPart();			
	
	public void setPart(String part) throws PartFormatException;
	
	public void setSet(int set);		
	
	public void setTimes(int times);	
	
	public void getExerciseInput(Scanner input);  
	
	public void printInfo();
	
	public void setExercisePart(Scanner input);		//0514 ¿îµ¿¸Å´ÏÀú¿¡¼­ ²ø¾î¿È.
	
	public void setExerciseSet(Scanner input);		
	
	public void setExerciseTimes(Scanner input);	
}
