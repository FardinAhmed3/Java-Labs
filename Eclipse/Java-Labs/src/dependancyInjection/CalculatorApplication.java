package dependancyInjection;

import java.util.Scanner;

public class CalculatorApplication {

	public static void main (String[]args) {
		Calculator calc=new BasicCalculator();
		new CalculatorApplication().performCalculations(calc);
		
	}
	
	
	
	
	
	public void performCalculations(Calculator calculator){
			// TODO Auto-generated method stub
		
		
			System.out.println("Welcome to the Calculator app through interfaces");
			Scanner scnr=new Scanner(System.in);
			System.out.println("Enter x");
			double x=scnr.nextDouble();
			System.out.println("Enter y");
			double y=scnr.nextDouble();
			
			System.out.println(calculator.add(x,y));
			System.out.println(calculator.subtract(x,y));
			System.out.println(calculator.multiply(x,y));
			System.out.println(calculator.divide(x,y));
			
		}
	
	
}
