package abstract_overriding;

public abstract class Bevarages {


	/* Common methods that will be used by sub classes*/
	public void boilMilk(){
		System.out.println("milk");
	}
	public void suger(){
		System.out.println("suger");		
	}	
	
	public void hotWater(){
		System.out.println("hot water");
	}
	/* Force subclasses to override and implement it*/
	public abstract void ingredient();
}