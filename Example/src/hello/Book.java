package hello;   // Abstract class


import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(String s){
		return s;
	}
}

//Write MyBook class here
class MyBook extends Book{
   void setTitle(String s) {
       title=s;
	   //System.out.println("Hello");
   }
}
