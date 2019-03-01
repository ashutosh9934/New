 class Test implements A {
 
	public static void main(String... args) {
		A test = new Test();
		System.out.println("Total of numbers in passed array is:"
				+ test.addNumbers(new int[] { 1, 2, 3 }));
	}
 
	public int addNumbers(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}
}