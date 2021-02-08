package domain;

 /**
 * The class Animal
 */ 
public class Animal {
	
	protected String name;
	
	protected int age;
	protected int weight;
	
	/** 
	 *
	 * It is a constructor. 
	 *
	 */
	public Animal() { 
		name = "gerenic animal";
		age = 0;
		weight = 1;
	}
	
	/** 
	 *
	 * Speak
	 *
	 */
	public void speak() { 
		System.out.println("Animal speaking...");
	}
	
	/** 
	 *
	 * Eat
	 *
	 */
	public void eat() { 
		System.out.println("Animal eating...");
	}
	
	/** 
	 *
	 * Sleep
	 *
	 */
	public void sleep() { 
		System.out.println("Animal sleeping...");
	}
	
	/** 
	 *
	 * To string
	 *
	 * @return String
	 */
	public String toString() { 
		return "Animal:" + "\nName:\t" + name + "\nAge:\t" + age + "\nWeight:\t" + weight;
	}
}
