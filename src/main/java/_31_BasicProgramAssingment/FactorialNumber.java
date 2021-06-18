package _31_BasicProgramAssingment;

public class FactorialNumber {
	
	//4= 4*3*2*1 
	//3= 3*2*1
	
	// without Recursive function---- for loop
	public static int factorial(int num) {
		int fact = 1;
		if(num ==0) 
			return 1;
		for(int i =1; i<=num; i++) {
			fact = fact*i;
		}
		return fact;
		
	}
	
	// with using Recursive function --> A function calling to itself is called Recursive function
	
	public static int fact(int num)
	{
		if(num ==0)
			return 1;
		
		else 
			return(num * fact(num - 1));
		
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(3));
		System.out.println(factorial(10));
		
		System.out.println(fact(4));
		System.out.println(fact(7));
		System.out.println(fact(8));

	}

}
