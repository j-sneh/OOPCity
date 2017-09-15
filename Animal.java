package oopCity;


public abstract class Animal extends Nameable {
	public abstract void speak();

	public String getSpecies(){
	    return this.getClass().getSimpleName();
    }
}

