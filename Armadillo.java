package oopCity;

public class Armadillo extends Animal{
	public Armadillo(String aName){
		name = aName;
	}
	
	public String getName(){
		return name;
	}
	public void speak(){
		System.out.println(name + " grunts at you with joy.");
	}
}