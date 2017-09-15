package oopCity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zoo extends Location {
    private ArrayList<Animal> zoo;

    public Zoo(String name){
        this.name = name;
        zoo = new ArrayList<>();
    }

    public Zoo(String name, Animal ... animals){
        this.name = name;
        zoo = new ArrayList<>(Arrays.asList(animals));
    }
    public void menu(Scanner input){
        System.out.println("What do you want to do? To see the guide type \"1\"");
        String which = input.nextLine().trim().toLowerCase();
        switch (which){
            case "1":
                guide();
                break;
            case "2":
                add(input);
                break;
            case "3":
                wave(input);
                break;
            case "4":
                System.out.println(this);
                break;
            case "5":
                leaveZoo();
                break;
            case "6":
                System.out.println("Exiting zoo. We hope you enjoyed your time at Java Zoo: \"So much fun it would probably cause a memory error!\" \n Goodbye!");
                System.exit(0);
            case "7":
                remove(input,zoo);
                break;
            default:
                System.out.println("That is not a valid action, type \"1\" for more info.");
                break;

        }
    }
    private void wave(Scanner input){
        System.out.println("Which animal do you want to wave at?");
        String whichAnimal = input.nextLine().trim();
        Animal toBeWaved = Nameable.find(whichAnimal,zoo);
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

    protected void add(Scanner input){
        System.out.println("Name your animal.");
        name = input.nextLine().trim();
        Animal namecheck = Nameable.find(name,zoo);
        if (namecheck != null){
            System.out.println("An animal by that name is already in the Zoo, please try again");
            return;
        }
        System.out.println("What species of animal do you want to add to the zoo? We currently have Zebras, Penguins, Elephants, Tigers, and Armadillos!");
        String animalType = input.nextLine().toLowerCase().trim();
        switch (animalType){
            case "zebra":
                zoo.add(new Zebra(name));
                break;
            case "penguin":
                zoo.add(new Penguin(name));
                break;
            case "elephant":
                zoo.add(new Elephant(name));
                break;
            case "tiger":
                zoo.add(new Tiger(name));
                break;
            case "armadillo":
                zoo.add(new Armadillo(name));
                break;
            default:
                System.out.println("Invalid animal species, please try again.");
                return;
        }
        System.out.println("Your animal has been added to the zoo");

    }

    protected void guide(){
        System.out.println("This is the Java Zoo's official guide. \"The Java Zoo: Where anyone can have a vast Array of fun!\" ");
        System.out.println("Type in an action: 1) Guide, 2) Add 3) Wave");
        System.out.println("4) List 5) Main Menu 6) Exit 7) Remove.");
        System.out.println("There are 5 species in the zoo: Zebras, Penguins, Elephants, Tigers & Armadillos \n");
    }

    public String toString(){
        if (zoo.size() == 0){
            return "There are 0 animals in the zoo, please add some.";
        } else if (zoo.size() == 1){
            return "There is 1 animal in the zoo. The animal is: " + zoo.get(0).getSpecies() + ": " + zoo.get(0).getName();

        } else {
            String animals = zoo.get(0).getSpecies() + ": " + zoo.get(0).getName();
            for (int i = 1; i < zoo.size();i++){
               animals += ", " + zoo.get(i).getSpecies() + ": " + zoo.get(i).getName();
            }
            return String.format("There are %d animals in the zoo. The animals are: %s %n",zoo.size(),animals);
        }
    }
    private void leaveZoo(){
        System.out.println("Exiting zoo. We hope you enjoyed your time at Java Zoo: \"So much fun it would probably cause a memory error!\" \n Goodbye!");
        Main.menu(this);
    }

    protected void settings(Scanner input){
        //TODO implement Name Changes, Zoo welcome messages, turning adding/removing on and off.
    }
}
