package test;

import domain.Bird;

 /**
 * The class Test animal
 */ 
public class TestAnimal {
	
	/** 
	 *
	 * Main
	 *
	 * @param args  the args
	 */
	public static void main(String[] args) { 
		Bird bird = new Bird("Pigeon", 8, 650);
		
		bird.eat();
		bird.fly();
		bird.hunt();
		bird.sleep();
		bird.speak();
		
		System.out.println("\n" + bird);
	}
}
