package oopCity;

public class Elephant extends Animal{
	public Elephant(String eName){
		name = eName;
	}
	public void speak(){
		System.out.println(name + " trumpets at you with their trunk.");
	}

}