package domain;


 /**
 * The class Bird extends predator
 */ 
public class Bird extends Predator {
	
	private static final String DEFAULT_KIND = "just a bird";
	
	private String kind;
	

	/** 
	 *
	 * Bird
	 *
	 * @param name  the name
	 * @param age  the age
	 * @param weight  the weight
	 * @param kind  the kind
	 * @return 	public
	 */
	public Bird(String name, int age, int weight, String kind) { 
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.kind = kind;
    }
	

	/** 
	 *
	 * Bird
	 *
	 * @param name  the name
	 * @param age  the age
	 * @param weight  the weight
	 * @return 	public
	 */
	public Bird(String name, int age, int weight) { 
		this(name, age, weight, DEFAULT_KIND);
    }
	

	/** 
	 *
	 * Bird
	 *
	 * @return 	public
	 */
	public Bird() { 
        this("DefaultBird", -1, -1, DEFAULT_KIND);
    }
	
    @Override

	/** 
	 *
	 * Hunt
	 *
	 */
    public void hunt() { 
        System.out.println("Beetle hunting...");
    }
    
    @Override

	/** 
	 *
	 * Speak
	 *
	 */
    public void speak() { 
    	System.out.println("Bird speaking...");
    }
    
    @Override

	/** 
	 *
	 * Eat
	 *
	 */
    public void eat() { 
        System.out.println("Bird eats...");
    }
    

	/** 
	 *
	 * Fly
	 *
	 */
    public void fly() { 
    	System.out.println("Bird is flyable...");
    }
    
    @Override

	/** 
	 *
	 * To string
	 *
	 * @return String
	 */
    public String toString() { 
    	return super.toString() + "\nKind:\t" + kind + "\n\nThis is Bird!";
    }
}
