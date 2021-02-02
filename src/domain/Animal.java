package domain;

public class Animal {
	
	protected String name;
	
	protected int age;
	protected int weight;
	
	public Animal() {
        name = "gerenic animal";
        age = 0;
        weight = 1;
    }
	
	public void speak() {
		System.out.println("Animal speaking...");
	}
	
	public void eat() {
		System.out.println("Animal eating...");
	}
	
	public void sleep() {
		System.out.println("Animal sleeping...");
	}
	
	public String toString() {
		return "Animal:" + "\nName:\t" + name + "\nAge:\t" + age + "\nWeight:\t" + weight;
	}
}
