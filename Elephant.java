package oopCity;

public class Elephant extends Animal{
	public Elephant(String eName){
		name = eName;
	}
	
	public String getName(){
		return name;
	}
	public void speak(){
		System.out.println(name + " trumpets at you with their trunk.");
	}
}