package oopCity;



public abstract class Nameable{
	protected String name;
	String getName(){
	    return name;
    }
	static <T extends Nameable> T find(String name, java.util.ArrayList<T> list){
		for (T thing : list){
			if (thing.getName().equalsIgnoreCase(name)){
				return thing;
			}

		}
		return null;
	}

	static <T extends Nameable> void remove(java.util.Scanner input, java.util.ArrayList<T> list){
        System.out.printf("What would you like to remove?");
        String name = input.nextLine().trim();
        T toRemove = find(name, list);
        if (toRemove != null){
            list.remove(toRemove);
        }else{
            System.out.println(String.format("%s was not found, so it could not be removed.",name));
        }
    }

}
