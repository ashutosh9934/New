package abstract_overriding;

public class VendingMachine {
 
	
	public static void main(String[] args) {
		
 
		/* ----  Prepare tea -----------------*/
		System.out.println("Serve Tea : ");
		Bevarages tea = new Tea();
		tea.hotWater();
		tea.boilMilk();
		tea.suger();
		tea.ingredient();
		
		/* ----  Prepare Coffee -----------------*/
		System.out.println("\nServe Coffee : ");
		Bevarages coffee = new Coffee();
		coffee.hotWater();
		coffee.boilMilk();
		coffee.suger();
		coffee.ingredient();
	}
 
}