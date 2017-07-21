package oopCity;

public class Tiger extends Animal{
	public Tiger(String tName){
		name = tName;
	}
	
	public String getName(){
		return name;
	}
	public void speak(){
		System.out.println(name + " chuffs and growls at you");
	}
}