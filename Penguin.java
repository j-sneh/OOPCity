package oopCity;

public class Penguin extends Animal{
	public Penguin(String pName){
		name = pName;
	}

	public void speak(){
		if (name.equalsIgnoreCase("pingu")){
			System.out.println("Pingu goes NOOT NOOT");
			System.out.println();
		} else {
			System.out.println(name + " starts gakking at you.");
		}
	}
}