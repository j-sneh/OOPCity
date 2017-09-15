package oopCity;

public class Armadillo extends Animal{
	public Armadillo(String aName){
		name = aName;
	}
	public void speak(){
		System.out.println(name + " grunts at you with joy.");
	}
}