package oopCity;

public class Zebra extends Animal{
	public Zebra(String name){

	    this.name = name;
	}

	public void speak(){
		System.out.println(name + " starts squeaking at you.");
	}
}
