package hello;

import java.util.Scanner;

public class Main{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the text");
	String title=sc.next();
		//String title="Hello";
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle(title));
      	sc.close();
		
	}
}