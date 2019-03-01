package run_time_polymorphism;

public class Driving {
	
	// /Here object of the car only can be known at run time
		public void drive(Car c) {
			c.run();
		}
}
