package oops;             //////// Inheritance

import java.util.*;

class Animal1{
	
	public void walk(){
		System.out.println("I am walking");
	}

	public static void main(String[] args) {

			  Bird bird = new Bird();
			  bird.walk();
			  bird.fly();
		      bird.sing();
			
		   }
		}

class Bird extends Animal1{
	public void fly(){
		System.out.println("I am flying");
	}
    public void sing(){
        System.out.println("I am singing");
    }
}

//package oops;             //////// Inheritance
//
//import java.util.*;

// With help of static method

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//class Animal{
//	void walk(){
//		System.out.println("I am walking");
//	}
//
//
//static class Bird extends Animal{
//	void fly(){
//		System.out.println("I am flying");
//	}
//    void sing(){
//        System.out.println("I am singing");
//    }
//
//
//
//
//   public static void main(String args[]){
//
//	  Bird bird = new Bird();
//	  bird.walk();
//	  bird.fly();
//      bird.sing();
//	
//   }
//}
//}