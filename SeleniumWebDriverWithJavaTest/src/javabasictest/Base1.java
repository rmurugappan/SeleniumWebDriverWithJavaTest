package javabasictest;

public class Base1 {
	 void show() { 
		    System.out.println("Base::show() called"); 
		 } 
		} 
		class Derived extends Base1 { 
			@Override
		 void show() { 
		    System.out.println("Derived::show() called"); 
		 } 
		} 
		class Problem2 { 
		 public static void main(String[] args) { 
		     Base1 b = new Derived();
		     b.show(); 
		 } 
}
