package oops;

import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
  
  public static void main(String []args){
      MyCalculator my_calculator = new MyCalculator();
      System.out.print("I implemented: ");
      ImplementedInterfaceNames(my_calculator);
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int n = sc.nextInt();
      System.out.print(my_calculator.divisor_sum(n) + "\n");
    	sc.close();
  }
  


//Write your code here
class MyCalculator implements AdvancedArithmetic
    {
    public int divisor_sum(int number)
        {
        int sum = 0;
        
        for(int i = 1; i <= number / 2; ++ i)
            if(number % i == 0)
             sum += i;
        
        return sum + number;
    }

    }
   
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    public static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}