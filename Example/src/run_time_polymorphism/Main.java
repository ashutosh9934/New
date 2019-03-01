package run_time_polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driving d =new Driving();
		
		Car m=new Maruti(); // here we supply Maruti Object
		d.drive(m);
	
		
		Car h=new Honda();  // here we supply Honda object
		d.drive(h);

}
}