package oopCity;

public class Zebra extends Animal{
	public Zebra(String zName){
		name = zName;
	}
	
	public String getName(){
		return name;
	}
	public void speak(){
		System.out.println(name + " starts squeaking at you.");
	}
}