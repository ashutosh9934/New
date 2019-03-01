package final1;

//base class
class Insurance {

	// Java final keyword in method - Cannot be overridden by child class
	public final  void InsuranceQuote() {
		System.out.println("Insurance quote by company");
	}

	// can be overridden by child class
	public void process() {

		System.out.println("Process Insurance online");

	}


//Derived class
class InsuranceAgent extends Insurance {

	// We cannot override it as in base class, it is final

	// public void InsuranceQuote(){}

	// Override process method from base class
	// Insurance
	public void process() {
		System.out.println("Process Insurance offline");
	}
}
	public static void main(String[] args) {
		Insurance in= new Insurance();
	}
}
