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

//	private static ArrayList<Human> people = new ArrayList<Human>();
	private static ArrayList<Animal> zoo = new ArrayList<Animal>();
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Java Zoo! If you need help on what to do type \"guide\"");
		while (true){
			 mainMenu();
		}
	}
	
	
	public static void mainMenu(){
		zooMenu(zoo,input);
	}
	public static void zooMenu(ArrayList<Animal> zoo,Scanner input){
		System.out.println("What do you want to do?");
		String which = input.nextLine().trim().toLowerCase();
		switch (which){
			case "guide":
				zooGuide();
				break;
			case "add":
				addAnimal();
				break;
			case "wave":
				wave();
				break;
			case "read":
				animals();
				break;
			case "drive":
				leaveZoo();
				break;
			case "exit":
				System.out.println("Exiting zoo. We hope you enjoyed your time at Java Zoo: \"So much fun it would probably cause a memory error!\" \n Goodbye!");
				System.exit(0);
			case "remove":
				removeAnimal();
				break;
			default:
				System.out.println("That is not a valid action, type \"guide\" for more info.");
				break;
			
		}
	}
	public static void wave(){
		 System.out.println("Which animal do you want to wave at?");
		 String whichAnimal = input.nextLine().trim();
		 Animal toBeWaved = findAnimal(whichAnimal);
		 if (whichAnimal.equals("all")){
			 for (Animal a : zoo){
				 a.speak();
			 }
		 }
		 else if (toBeWaved != null){
			 toBeWaved.speak();
		 } else if (zoo.size() <= 0) {
			 System.out.println("There are no animals in the Java Zoo, please add some!");
		 } else {
			 System.out.println("That is not a valid animal in the Java Zoo, please read the list of animals.");
		 }

	}
	public static Animal findAnimal(String input){
		for (Animal a : zoo){
			if ((a.getName()).equalsIgnoreCase(input)){
				return a;
			}
			 
		}
		return null;
	}
	public static void addAnimal(){
		System.out.println("What species of animal do you want to add to the zoo? We currently have Zebras, Penguins, Elephants, Tigers, and Armadillos!");
		String animalType = input.nextLine().toLowerCase().trim();
		switch (animalType){
			case "zebra":
				System.out.println("Name your animal.");
				String name = input.nextLine().trim();
				Animal namecheck = findAnimal(name);
				if (namecheck instanceof Animal){
					System.out.println("An animal by that name is already in the Zoo, please try again");
					addAnimal();
				}
				zoo.add(new Zebra(name));
				break;
			case "penguin":
				System.out.println("Name your animal.");
				name = input.nextLine().trim();
				namecheck = findAnimal(name);
				if (namecheck instanceof Animal){
					System.out.println("An animal by that name is already in the Zoo, please try again");
					addAnimal();
				}
				zoo.add(new Penguin(name));
				break;
			case "elephant":
				System.out.println("Name your animal.");
				name = input.nextLine().trim();
				namecheck = findAnimal(name);
				if (namecheck instanceof Animal){
					System.out.println("An animal by that name is already in the Zoo, please try again");
					addAnimal();
				}
				zoo.add(new Elephant(name));
				break;
			case "tiger": 
				System.out.println("Name your animal.");
				name = input.nextLine().trim();
				namecheck = findAnimal(name);
				if (namecheck instanceof Animal){
					System.out.println("An animal by that name is already in the Zoo, please try again");
					addAnimal();
				}
				zoo.add(new Tiger(name));
				break;
			case "armadillo":
				System.out.println("Name your animal.");
				name = input.nextLine().trim();
				namecheck = findAnimal(name);
				if (namecheck instanceof Animal){
					System.out.println("An animal by that name is already in the Zoo, please try again");
					addAnimal();
				}
				zoo.add(new Armadillo(name));
				break;
			default:
				System.out.println("Invalid animal species, please try again.");
				addAnimal();
				break;
		}
		System.out.println("Your animal has been added to the zoo");
		
	}
	
	public static void removeAnimal(){
		System.out.println("Which animal would you like to remove?");
		String name = input.nextLine().trim();
		Animal toRemove = findAnimal(name);
		if (toRemove != null){
			zoo.remove(toRemove);
		}else{
			System.out.println("Animal not in zoo, please look at the list of animals by typing \"read\"");
		}
		
	}
	public static void zooGuide(){
		System.out.println("This is the Java Zoo's official guide. \"The Java Zoo: Where anyone can have a vast Array of fun!\" ");
		System.out.print("Type in an action: \"add\",\"wave\", \"read\",");
		System.out.println(" \"remove\", \"drive\" or \"exit\".");
		System.out.println("There are 5 species in the zoo: Zebras, Penguins, Elephants, Tigers & Armadillos \n");
	}
	public static void animals(){
		if (zoo.size() == 0){
			System.out.println("There are 0 animals in the zoo, please add some.");
		} else if (zoo.size() == 1){
			System.out.println("There is 1 animal in the zoo. The animals is:");
			for (Animal a : zoo){
				System.out.println(a.getName());
			}
		} else {
			System.out.printf("There are %d animals in the zoo. The animals are: %n",zoo.size());
			for (Animal a : zoo){
				System.out.println(a.getName());
			}
		}
	}
	public static void leaveZoo(){
		System.out.println("Exiting zoo. We hope you enjoyed your time at Java Zoo: \"So much fun it would probably cause a memory error!\" \n Goodbye!");
		mainMenu();
	}
}
