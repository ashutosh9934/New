package oops;



abstract public class Animal {
	
	public Animal() {
		
	}
	
	private String name,picture,food;
	boolean hunger;
	int boundary;
	
	public Animal(String name, String picture, String food, boolean hunger, int boundary) {
		super();
		this.name = name;
		this.picture = picture;
		this.food = food;
		this.hunger = hunger;
		this.boundary = boundary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public boolean isHunger() {
		return hunger;
	}

	public void setHunger(boolean hunger) {
		this.hunger = hunger;
	}

	public int getBoundary() {
		return boundary;
	}

	public void setBoundary(int boundary) {
		this.boundary = boundary;
	}
	
	public abstract void speak();
	public abstract void eat();
	
	public void sleep() {
		System.out.println(getClass().getSimpleName()+" is sleeping ");
	}
	
	public void roam() {
		System.out.println(getClass().getSimpleName()+" is roaming ");
	}
	
	
	
	

}

