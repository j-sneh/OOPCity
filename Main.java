package oopCity;
import java.util.*;
/*
 * The program should let me do 4 things:
 * 
 * 		1. Add an animal to the zoo. I get to choose their type and their name.
 * 		2. Show me a list of all the animals in the zoo.
 * 		3. Let me choose an animal in the zoo, by name, to speak. Or all.
 * 		4. Exit the program.
 * 
 * I am allowed to do any of these options on any turn.
 */
public class Main {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Zoo javaZoo = new Zoo("Java",new Zebra("Zeb"));
		while (true){
			 menu(javaZoo);
		}
	}
	
	
	public static void menu(Zoo zoo){
		zoo.menu(input);
	}

}