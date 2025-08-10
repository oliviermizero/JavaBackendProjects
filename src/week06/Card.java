package week06;

public class Card {
	private int value;
	private String name;
	
	// Constructor
	public Card(int value, String name) {
		this.setValue(value);
		this.setName(name);
	}
	
	// Getters
	public int getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}

	// Setters
	public void setValue(int value) {
		this.value = value;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Describe method
	public void describe() {
		System.out.println(name + " (Value: " + value + ")");
	}
}
