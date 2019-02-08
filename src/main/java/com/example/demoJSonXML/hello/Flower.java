package com.example.demoJSonXML.hello;

public class Flower {
	private String name;
    private Color color;
    private Integer petals;
    
    public enum Color { PINK, BLUE, YELLOW, RED; }
    
	public Flower() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Integer getPetals() {
		return petals;
	}

	public void setPetals(Integer petals) {
		this.petals = petals;
	}

	@Override
	public String toString() {
		return "Flower [name=" + name + ", color=" + color + ", petals=" + petals + ", getName()=" + getName()
				+ ", getColor()=" + getColor() + ", getPetals()=" + getPetals() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
