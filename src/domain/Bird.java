package domain;

public class Bird extends Predator {
	
	private static final String DEFAULT_KIND = "just a bird";
	
	private String kind;
	
	public Bird(String name, int age, int weight, String kind) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.kind = kind;
    }
	
	public Bird(String name, int age, int weight) {
		this(name, age, weight, DEFAULT_KIND);
    }
	
	public Bird() {
        this("DefaultBird", -1, -1, DEFAULT_KIND);
    }
	
    @Override
    public void hunt() {
        System.out.println("Beetle hunting...");
    }
    
    @Override
    public void speak() {
    	System.out.println("Bird speaking...");
    }
    
    @Override
    public void eat() {
        System.out.println("Bird eats...");
    }
    
    public void fly() {
    	System.out.println("Bird is flyable...");
    }
    
    @Override
    public String toString() {
    	return super.toString() + "\nKind:\t" + kind + "\n\nThis is Bird!";
    }
}
