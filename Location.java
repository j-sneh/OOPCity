package oopCity;
import java.util.Scanner;
public abstract class Location extends Nameable {
    public abstract String toString();
    abstract public void menu(Scanner input);
    abstract protected void guide();
    abstract protected void settings(Scanner input);
    protected abstract void add(java.util.Scanner input);

}
