package hello;

public class Practice {

	public void walk() {
	System.out.println("Anand");
}
	public static void main(String[] args) {
		Practice1 p1=new Practice1();
		p1.walk();
		p1.drink();
	}
}
	class Practice1 extends Practice{
		public void drink() {
			System.out.println("Drink");
		}
	}
