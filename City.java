package oopCity;

import java.util.*;

public class City {
	private ArrayList<Human> people;
	Random r = new Random();
	
	public City (Human... startingPeople){
		people = new ArrayList<Human>();
		for (Human human : startingPeople){
			people.add(human);
		}
	}
	
	public City() {
		people = new ArrayList<Human>();
	}
	
}
