package oopCity;

import java.util.*;

public class Zoo {
	private ArrayList<Animal> zoo;
	Random r = new Random();
	
	public Zoo (Animal... startingAnimals){
		for (Animal animal : startingAnimals){
			zoo.add(animal);
		}
	}
	public Zoo() {
		zoo = new ArrayList<Animal>();
	}
	
}
